package com.shopping.center.kt.shoppingcenterkt.controller


import com.shopping.center.kt.shoppingcenterkt.model.City
import com.shopping.center.kt.shoppingcenterkt.service.CityService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Api(value="admin-controller", description="All operation allowed")
class AdminController(var cityService: CityService) {

    @PostMapping("createCity")
    @ApiOperation(value = "create cities")
    fun createCity(@RequestParam nameParam: String, @RequestParam orientationParam: String): City {
        return cityService.createCity(nameParam, orientationParam)
    }

}