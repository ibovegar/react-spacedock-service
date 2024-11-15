package com.kotlinspring.entity

import jakarta.persistence.*

@Entity
@Table(name = "user_spacecraft")
data class UserSpacecraftEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int?,

    @ManyToOne
    val spacecraft: SpacecraftEntity,

    @ManyToOne
    val user: UserEntity,
)