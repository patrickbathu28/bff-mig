package com.prefeitura.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable


@FeignClient(name = "mig-msc", url = "\${mig.msc}")
interface MigMscClient {

    @GetMapping(path = arrayOf("/v1/iptu/{matricula}"))
    fun getIptu(@PathVariable("matricula") matricula: String?): String?

    @GetMapping(path = arrayOf("/v1/iptu/{matricula}"))
    fun getItr(@PathVariable("matricula") matricula: String?): String?

}