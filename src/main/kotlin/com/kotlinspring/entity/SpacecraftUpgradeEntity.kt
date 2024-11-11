package com.kotlinspring.entity

import com.kotlinspring.dto.SpacecraftUpgradeDTO
import jakarta.persistence.*

enum class SpacecraftUpgradeType {
    WEAPON, STABILIZER, DEFLECTOR, ENGINE, PLATING
}

@Entity
@Table(name = "spacecraft_upgrade")
data class SpacecraftUpgradeEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Int?,
    val name: String,
    val upgradeRegistry: String,
    val spacecraftRegistry: String,
    val manufacturer: String,
    val price: Int,
    @Enumerated(value = EnumType.STRING) var type: SpacecraftUpgradeType,
    val gain: Int
)

// TODO: Move to Spacecraft upgrade service
fun SpacecraftUpgradeEntity.toSpacecraftUpgradeDTO() = SpacecraftUpgradeDTO(
    id = this.id,
    name = this.name,
    upgradeRegistry = this.upgradeRegistry,
    manufacturer = this.manufacturer,
    spacecraftRegistry = this.spacecraftRegistry,
    price = this.price,
    type = this.type,
    gain = this.gain
)
