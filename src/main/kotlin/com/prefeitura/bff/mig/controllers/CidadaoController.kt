package com.prefeitura.bff.mig.controllers

import com.prefeitura.bff.mig.client.MigSasciClient
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.ws.rs.PathParam

@RestController
class CidadaoController(val migSasciClient: MigSasciClient ) {

    @GetMapping("/v1/cidadao/all",  produces= [MediaType.APPLICATION_JSON_VALUE])
    fun getCidadaoAll() : ResponseEntity<String> = ResponseEntity.status(HttpStatus.OK).body(migSasciClient?.getCidadaoAll())

    @GetMapping("/v1/cidadao/{id}",  produces= [MediaType.APPLICATION_JSON_VALUE])
    fun getCidadaoById(@PathParam("id") id : String) : ResponseEntity<String> = ResponseEntity.status(HttpStatus.OK).body(migSasciClient?.getCidadaoById(id))

}