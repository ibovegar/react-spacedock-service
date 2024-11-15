package com.kotlinspring.entity

import jakarta.persistence.*

enum class SpacecraftType {
    INTERCEPTOR, FIGHTER, BOMBER, SUPPORT, SCOUT
}

// TODO: Remove
enum class StoreType {
    SPACECRAFT
}

@Entity
@Table(name = "spacecrafts")
data class SpacecraftEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int?,

    val name: String,
    val spacecraftRegistry: String,
    val manufacturer: String,
    val manufactured: Int,
    val height: Int,
    val length: Int,
    val price: Int,
    val speed: Int,
    val hull: Int,
    val shield: Int,
    val damage: Int,
    val manuvrability: Int,

    @Enumerated(value = EnumType.STRING)
    var type: SpacecraftType,

    @Enumerated(value = EnumType.STRING)
    var storeType: StoreType,

    @OneToMany(mappedBy = "spacecraft")
    val userSpacerafts: List<UserSpacecraftEntity> = mutableListOf()
)