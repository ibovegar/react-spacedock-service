package com.kotlinspring.entity

import jakarta.persistence.*

@Entity
@Table(name = "spacecraft_stats")
data class SpacecraftStatsEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Int?,
    val speed: Int,
    val hull: Int,
    val shield: Int,
    val damage: Int,
    val manuvrability: Int,
    @OneToOne(mappedBy = "baseStats") val spacecraft: SpacecraftEntity
)


