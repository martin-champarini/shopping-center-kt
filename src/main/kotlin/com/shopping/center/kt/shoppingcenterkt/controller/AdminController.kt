package com.shopping.center.kt.shoppingcenterkt.controller


import com.shopping.center.kt.shoppingcenterkt.model.City
import com.shopping.center.kt.shoppingcenterkt.model.Country
import com.shopping.center.kt.shoppingcenterkt.service.CityService
import com.shopping.center.kt.shoppingcenterkt.service.CountryService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Api(value="admin-controller", description="All operation allowed")
class AdminController(var cityService: CityService, var countryService: CountryService) {

    @PostMapping("addCity")
    @ApiOperation(value = "Add cities")
    fun addCity(@RequestParam nameParam: String, @RequestParam orientationParam: String): City {
        return cityService.createCity(nameParam, orientationParam)
    }

    @PostMapping("addCountry")
    @ApiOperation(value = "Add Country And City")
    fun addCountry(@RequestParam nameParam: String,
                   @RequestParam continentParam: String,
                   @RequestParam capitalParan: String): Country {
        return countryService.addCountry(nameParam, continentParam, capitalParan)
    }
}