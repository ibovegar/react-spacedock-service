package com.kotlinspring.controller

import com.kotlinspring.dto.SpacecraftDTO
import com.kotlinspring.service.SpacecraftService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/spacecrafts")
@Validated
class SpacecraftController(val spacecraftService: SpacecraftService) {
    @GetMapping
    fun getAllSpacecrafts(): List<SpacecraftDTO> =
        spacecraftService.getAllSpacecrafts()

    @GetMapping("/{id}")
    fun getSpacecraftById(@PathVariable id: Int): SpacecraftDTO =
        spacecraftService.getSpacecraftById(id)
}