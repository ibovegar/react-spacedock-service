package com.kotlinspring.dto

import com.kotlinspring.entity.SpacecraftType
import com.kotlinspring.entity.StoreType

data class SpacecraftDTO(
    val id: Int?,
    val name: String,
    val spacecraftRegistry: String,
    val manufacturer: String,
    val manufactured: Int,
    val height: Int,
    val length: Int,
    val price: Int,
    val type: SpacecraftType,
    val storeType: StoreType,
    val baseStats: SpacecraftStatsDTO
    //val attachedUpgrades: string[];
)


