package com.kotlinspring.dto

import com.kotlinspring.entity.SpacecraftUpgradeType

data class SpacecraftUpgradeDTO (
    val id: Int?,
    val name: String,
    val upgradeRegistry: String,
    val spacecraftRegistry: String,
    val manufacturer: String,
    val price: Int,
    val type: SpacecraftUpgradeType,
    val gain: Int
)