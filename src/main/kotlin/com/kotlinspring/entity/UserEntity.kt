package com.kotlinspring.entity

import com.kotlinspring.dto.SpacecraftStatsDTO
import com.kotlinspring.dto.UserDTO
import jakarta.persistence.*

@Entity
@Table(name = "users")
data class UserEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Int?,
    val name: String,

    @OneToMany(mappedBy = "user")
    val userSpacerafts: List<UserSpacecraftEntity> = mutableListOf()
)