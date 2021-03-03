package com.prefeitura.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApplicationController {

    @GetMapping("/v1/application")
    fun read() : ResponseEntity<String> = ResponseEntity.ok("UP")

}