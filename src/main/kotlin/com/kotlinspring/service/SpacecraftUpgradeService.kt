package com.kotlinspring.service

import com.kotlinspring.dto.SpacecraftUpgradeDTO
import com.kotlinspring.entity.toSpacecraftUpgradeDTO
import com.kotlinspring.repository.SpacecraftUpgradeRepository
import org.springframework.stereotype.Service

@Service
class SpacecraftUpgradeService(val spacecraftUpgradeRepository: SpacecraftUpgradeRepository) {
    fun getAllSpacecraftUpgrades(): List<SpacecraftUpgradeDTO> {
        return spacecraftUpgradeRepository.findAll().map {
            it.toSpacecraftUpgradeDTO()
        }
    }
}