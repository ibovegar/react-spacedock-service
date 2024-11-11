package com.kotlinspring.dto

data class SpacecraftStatsDTO (
    val id: Int?,
    val speed: Int,
    val hull: Int,
    val shield: Int,
    val damage: Int,
    val manuvrability: Int,
)