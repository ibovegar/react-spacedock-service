package com.kotlinspring.repository

import com.kotlinspring.entity.SpacecraftUpgradeEntity
import org.springframework.data.repository.CrudRepository

interface SpacecraftUpgradeRepository : CrudRepository<SpacecraftUpgradeEntity, Int> {}