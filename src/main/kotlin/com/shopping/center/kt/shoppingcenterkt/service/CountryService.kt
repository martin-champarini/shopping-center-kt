package com.shopping.center.kt.shoppingcenterkt.service

import com.shopping.center.kt.shoppingcenterkt.model.City
import com.shopping.center.kt.shoppingcenterkt.model.Country
import com.shopping.center.kt.shoppingcenterkt.repository.CityRepository
import com.shopping.center.kt.shoppingcenterkt.repository.CountryRepository
import org.springframework.stereotype.Service

@Service
class CountryService(var countryRepository: CountryRepository, var cityRepository: CityRepository) {

    fun addCountry(nameParam: String, continentParam: String, cityParam: String): Country {
        val city = City(
                name = cityParam
        )
        cityRepository.save(city)

        val country = Country(
                name = nameParam,
                continent = continentParam,
                city = cityParam
        )
        return countryRepository.save(country)
    }

    fun deleteCountryByName(nameParam: String) {
        countryRepository.deleteByName(nameParam)
    }

    fun deleteAll() {
        countryRepository.deleteAll()
    }

    fun findAll(): MutableIterable<Country> {
        return countryRepository.findAll()
    }

    fun findByName(nameParam: String): Country{
        return countryRepository.findByName(nameParam)
    }
}