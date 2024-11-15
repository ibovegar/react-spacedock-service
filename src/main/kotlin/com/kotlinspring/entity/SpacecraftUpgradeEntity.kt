package com.kotlinspring.entity

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
