package com.kotlinspring.service

import com.kotlinspring.dto.SpacecraftDTO
import com.kotlinspring.entity.toSpacecraftDTO
import com.kotlinspring.repository.SpacecraftRepository
import org.springframework.stereotype.Service

@Service
class SpacecraftService(val spacecraftRepository: SpacecraftRepository) {
    fun getAllSpacecrafts(): List<SpacecraftDTO> {
        return spacecraftRepository.findAll().map {
            it.toSpacecraftDTO()
        }
    }

    fun getSpacecraftById(id: Int): SpacecraftDTO {
        return spacecraftRepository.findById(id).map { it.toSpacecraftDTO() }.orElseGet(null)
    }
}