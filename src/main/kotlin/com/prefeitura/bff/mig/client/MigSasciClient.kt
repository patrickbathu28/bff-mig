package com.prefeitura.bff.mig.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("mig-sasci")
interface MigSasciClient {

    @GetMapping(path = arrayOf("/v1/cidadao/all"), consumes= arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun getCidadaoAll(): String?

}