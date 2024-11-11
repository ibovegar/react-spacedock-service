package com.kotlinspring.service

import com.kotlinspring.dto.UserDTO
import com.kotlinspring.entity.toUserDTO
import com.kotlinspring.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {
    fun getUserById(id: Int): UserDTO {
        return userRepository.findById(id).map { it.toUserDTO() }.orElseGet(null)
    }
}