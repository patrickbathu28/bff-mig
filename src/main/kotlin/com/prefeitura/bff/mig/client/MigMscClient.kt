package com.prefeitura.bff.mig.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable


@FeignClient("mig-msc")
interface MigMscClient {

    @GetMapping(path = ["/v1/iptu/{matricula}"])
    fun getIptu(@PathVariable("matricula") matricula: String?): String?

    @GetMapping(path = ["/v1/iptu/{matricula}"])
    fun getItr(@PathVariable("matricula") matricula: String?): String?

}