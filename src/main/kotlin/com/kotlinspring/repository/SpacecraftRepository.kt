package com.kotlinspring.repository

import com.kotlinspring.entity.SpacecraftEntity
import org.springframework.data.repository.CrudRepository

interface SpacecraftRepository : CrudRepository<SpacecraftEntity, Int> {}