package com.prefeitura.bff.mig.controllers

import com.prefeitura.bff.mig.client.MigSasciClient
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CidadaoController(val migSasciClient: MigSasciClient ) {

    @GetMapping("/v1/cidadao/all",  produces= arrayOf(MediaType.APPLICATION_JSON_VALUE) )
    fun getCidadaoAll() : ResponseEntity<String> = ResponseEntity.status(HttpStatus.OK).body(migSasciClient?.getCidadaoAll())

}