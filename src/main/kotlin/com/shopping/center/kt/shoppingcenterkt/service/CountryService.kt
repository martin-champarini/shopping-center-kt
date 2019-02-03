package com.shopping.center.kt.shoppingcenterkt.service

import com.shopping.center.kt.shoppingcenterkt.model.City
import com.shopping.center.kt.shoppingcenterkt.model.Country
import com.shopping.center.kt.shoppingcenterkt.repository.CountryRepository
import org.springframework.stereotype.Service

@Service
class CountryService(var countryRepository: CountryRepository) {

    fun addCountry(nameParam: String, continentParam: String, cityParam: String): Country {
        val country= Country(
                name = nameParam,
                continent = continentParam,
                city = listOf(
                        City(name = cityParam)
                   )
                )
        return countryRepository.save(country)
    }
}