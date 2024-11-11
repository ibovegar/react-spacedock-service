package com.kotlinspring.repository

import com.kotlinspring.entity.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserEntity, Int> {}
