package com.github.douglsantos.entrypoint.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/corvus-investment/v1/stocks")
class StockController {

    @Get
    fun hello(name: String): HttpResponse<String> {
        return HttpResponse.ok("Hello, $name")
    }
}