package com.kotlinspring.controller

import com.kotlinspring.dto.UserDTO
import com.kotlinspring.service.UserService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
@Validated
class UserController(val userService: UserService) {
    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Int): UserDTO =
        userService.getUserById(id)
}