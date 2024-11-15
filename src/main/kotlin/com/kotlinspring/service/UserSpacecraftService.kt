package com.kotlinspring.service

import com.kotlinspring.dto.SpacecraftDTO
import com.kotlinspring.dto.UserSpacecraftDTO
import com.kotlinspring.entity.UserSpacecraftEntity
import com.kotlinspring.repository.SpacecraftRepository
import com.kotlinspring.repository.UserRepository
import com.kotlinspring.repository.UserSpacecraftRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UserSpacecraftService(
    private val userSpacecraftRepository: UserSpacecraftRepository,
    private val spacecraftRepository: SpacecraftRepository,
    private val userRepository: UserRepository
) {
    fun getUserSpacecrafts(userId: Int): List<UserSpacecraftDTO> {
        return userSpacecraftRepository.findByUserId(userId).map {
            toUserSpacecraftDTO(it)
        }
    }

    fun getUserSpacecraftById(userId: Int, spacecraftId: Int): UserSpacecraftDTO {
        val userSpacecraftEntity =
            userSpacecraftRepository.findByUserIdAndSpacecraftId(userId, spacecraftId) ?: throw ResponseStatusException(
                HttpStatus.NOT_FOUND, "Spacecraft not found"
            )

        return toUserSpacecraftDTO(userSpacecraftEntity)
    }

    fun addUserSpacecraft(userId: Int, userSpacecraftDTO: UserSpacecraftDTO): UserSpacecraftDTO {
        val spacecraftEntity = spacecraftRepository.findById(userSpacecraftDTO.spacecraftId).orElseThrow {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Spacecraft not found")
        }

        val userEntity = userRepository.findById(userId).orElseThrow {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
        }

        val userSpacecraftEntity = UserSpacecraftEntity(null, spacecraft = spacecraftEntity, user = userEntity)

        userSpacecraftRepository.save(userSpacecraftEntity)

        return toUserSpacecraftDTO(userSpacecraftEntity)
    }

    fun toUserSpacecraftDTO(entity: UserSpacecraftEntity) = UserSpacecraftDTO(
        id = entity.id, spacecraftId = entity.spacecraft.id!!, userId = entity.user.id!!, spacecraft = SpacecraftDTO(
            id = entity.spacecraft.id,
            name = entity.spacecraft.name,
            spacecraftRegistry = entity.spacecraft.spacecraftRegistry,
            manufacturer = entity.spacecraft.manufacturer,
            manufactured = entity.spacecraft.manufactured,
            height = entity.spacecraft.height,
            length = entity.spacecraft.length,
            price = entity.spacecraft.price,
            type = entity.spacecraft.type,
            storeType = entity.spacecraft.storeType,
            speed = entity.spacecraft.speed,
            damage = entity.spacecraft.damage,
            manuvrability = entity.spacecraft.manuvrability,
            shield = entity.spacecraft.shield,
            hull = entity.spacecraft.hull
        )
    )
}