package com.prefeitura.bff.mig.controllers

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApplicationController {

    @GetMapping("/v1/application",  produces= [MediaType.APPLICATION_JSON_VALUE])
    fun applicationUp() : ResponseEntity<String> = ResponseEntity.ok("UP")

}