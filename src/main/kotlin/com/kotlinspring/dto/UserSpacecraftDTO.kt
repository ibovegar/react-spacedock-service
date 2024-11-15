package com.kotlinspring.dto

data class UserSpacecraftDTO(
    val id: Int?,
    val spacecraftId: Int,
    val userId: Int,
    val spacecraft: SpacecraftDTO
)