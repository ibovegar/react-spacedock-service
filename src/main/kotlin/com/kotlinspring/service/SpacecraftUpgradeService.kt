package com.kotlinspring.service

import com.kotlinspring.dto.SpacecraftUpgradeDTO
import com.kotlinspring.entity.SpacecraftUpgradeEntity
import com.kotlinspring.repository.SpacecraftUpgradeRepository
import org.springframework.stereotype.Service

@Service
class SpacecraftUpgradeService(val spacecraftUpgradeRepository: SpacecraftUpgradeRepository) {
    fun getAllSpacecraftUpgrades(): List<SpacecraftUpgradeDTO> {
        return spacecraftUpgradeRepository.findAll().map {
            toSpacecraftUpgradeDTO(it)
        }
    }

    fun toSpacecraftUpgradeDTO(entity: SpacecraftUpgradeEntity) = SpacecraftUpgradeDTO(
        id = entity.id,
        name = entity.name,
        upgradeRegistry = entity.upgradeRegistry,
        manufacturer = entity.manufacturer,
        spacecraftRegistry = entity.spacecraftRegistry,
        price = entity.price,
        type = entity.type,
        gain = entity.gain
    )
}