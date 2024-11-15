package com.kotlinspring.service

import com.kotlinspring.dto.SpacecraftDTO
import com.kotlinspring.entity.SpacecraftEntity
import com.kotlinspring.repository.SpacecraftRepository
import org.springframework.stereotype.Service

@Service
class SpacecraftService(val spacecraftRepository: SpacecraftRepository) {
    fun getAllSpacecrafts(): List<SpacecraftDTO> {
        return spacecraftRepository.findAll().map {
            toSpacecraftDTO(it)
        }
    }

    fun getSpacecraftById(id: Int): SpacecraftDTO {
        return spacecraftRepository.findById(id).map { toSpacecraftDTO(it) }.orElseGet(null)
    }

    fun toSpacecraftDTO(entity: SpacecraftEntity) = SpacecraftDTO(
        id = entity.id,
        name = entity.name,
        manufacturer = entity.manufacturer,
        height = entity.height,
        length = entity.length,
        spacecraftRegistry = entity.spacecraftRegistry,
        manufactured = entity.manufactured,
        price = entity.price,
        type = entity.type,
        storeType = entity.storeType,
        speed = entity.speed,
        damage = entity.damage,
        manuvrability = entity.manuvrability,
        shield = entity.shield,
        hull = entity.hull
    )
}