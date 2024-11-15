package com.kotlinspring.controller

import com.kotlinspring.dto.UserSpacecraftDTO
import com.kotlinspring.service.UserSpacecraftService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user_spacecrafts")
class UserSpacecraftController(val userSpacecraftService: UserSpacecraftService) {
    @GetMapping
    fun getUserSpacecrafts(@RequestHeader("X-USER-ID") userId: Int): List<UserSpacecraftDTO> =
        userSpacecraftService.getUserSpacecrafts(userId)

    @GetMapping("/{spacecraftId}")
    fun getUserSpacecraftById(
        @RequestHeader("X-USER-ID") userId: Int, @PathVariable spacecraftId: Int
    ): UserSpacecraftDTO = userSpacecraftService.getUserSpacecraftById(userId, spacecraftId)


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addUserSpacecraft(
        @RequestHeader("X-USER-ID") userId: Int, @RequestBody userSpacecraftDTO: UserSpacecraftDTO
    ): UserSpacecraftDTO {
        return userSpacecraftService.addUserSpacecraft(userId, userSpacecraftDTO)
    }
}