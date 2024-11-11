package com.kotlinspring.controller

import com.kotlinspring.dto.SpacecraftUpgradeDTO
import com.kotlinspring.service.SpacecraftUpgradeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/spacecraft_upgrade")
class SpacecraftUpgradeController(val spacecraftUpgradeService: SpacecraftUpgradeService) {
    @GetMapping
    fun getAllSpacecraftUpgrades(): List<SpacecraftUpgradeDTO> =
        spacecraftUpgradeService.getAllSpacecraftUpgrades()
}