package com.kotlinspring.service

import com.kotlinspring.dto.UserDTO
import com.kotlinspring.entity.UserEntity
import com.kotlinspring.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {
    fun getAllUsers(): List<UserDTO> {
        return userRepository.findAll().map { toUserDTO(it) }
    }

    fun getUserById(id: Int): UserDTO {
        return userRepository.findById(id).map { toUserDTO(it) }.orElseGet(null)
    }

    fun toUserDTO(entity: UserEntity) = UserDTO(
        id = entity.id,
        name = entity.name,
    )

}