package com.kotlinspring.entity

import com.kotlinspring.dto.SpacecraftDTO
import com.kotlinspring.dto.SpacecraftStatsDTO
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

    @Enumerated(value = EnumType.STRING)
    var type: SpacecraftType,

    @Enumerated(value = EnumType.STRING)
    var storeType: StoreType,

    @OneToOne
    val baseStats: SpacecraftStatsEntity,

    @OneToMany(mappedBy = "spacecraft")
    val userSpacerafts: List<UserSpacecraftEntity> = mutableListOf()
)

// TODO: Move to Spacecraft service
fun SpacecraftEntity.toSpacecraftDTO() = SpacecraftDTO(
    id = this.id,
    name = this.name,
    manufacturer = this.manufacturer,
    height = this.height,
    length = this.length,
    spacecraftRegistry = this.spacecraftRegistry,
    manufactured = this.manufactured,
    price = this.price,
    type = this.type,
    storeType = this.storeType,
    baseStats = SpacecraftStatsDTO(
        id = this.baseStats.id,
        speed = this.baseStats.speed,
        damage = this.baseStats.damage,
        manuvrability = this.baseStats.manuvrability,
        shield = this.baseStats.shield,
        hull = this.baseStats.hull
    ),
)