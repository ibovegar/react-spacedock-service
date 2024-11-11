package com.kotlinspring.repository

import com.kotlinspring.entity.SpacecraftStatsEntity
import org.springframework.data.repository.CrudRepository

interface SpacecraftStatsRepository : CrudRepository<SpacecraftStatsEntity, Int> {}