package com.kotlinspring.repository

import com.kotlinspring.entity.UserSpacecraftEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserSpacecraftRepository : CrudRepository<UserSpacecraftEntity, Int> {
    @Query("SELECT us FROM UserSpacecraftEntity us WHERE us.user.id = :userId")
    fun findByUserId(userId: Int): List<UserSpacecraftEntity>

    @Query("SELECT us FROM UserSpacecraftEntity us WHERE us.user.id = :userId and us.spacecraft.id = :spacecraftId")
    fun findByUserIdAndSpacecraftId(userId: Int, spacecraftId: Int): UserSpacecraftEntity?
}