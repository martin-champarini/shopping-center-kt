package com.shopping.center.kt.shoppingcenterkt.service

import com.shopping.center.kt.shoppingcenterkt.model.City
import com.shopping.center.kt.shoppingcenterkt.repository.CityRepository
import org.springframework.stereotype.Service

@Service
class CityService(var cityRepository: CityRepository){


    fun createCity(nameParam: String, orientationParam: String): City {
        val city = City(
             name = nameParam,
             orientation = orientationParam
        )
        return cityRepository.save(city)
    }


}