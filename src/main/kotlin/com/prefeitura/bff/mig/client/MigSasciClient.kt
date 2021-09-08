package com.prefeitura.bff.mig.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import javax.ws.rs.PathParam

@FeignClient("mig-sasci")
interface MigSasciClient {

    @GetMapping(path = ["/v1/cidadao/all"], consumes= [MediaType.APPLICATION_JSON_VALUE])
    fun getCidadaoAll(): String?

    @GetMapping(path = ["/v1/cidadao/{id}"], consumes= [MediaType.APPLICATION_JSON_VALUE])
    fun getCidadaoById(@PathParam("id") id : String ): String?

}