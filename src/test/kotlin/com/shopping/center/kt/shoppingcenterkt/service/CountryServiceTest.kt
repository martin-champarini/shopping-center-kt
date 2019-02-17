package com.shopping.center.kt.shoppingcenterkt.service

import com.shopping.center.kt.shoppingcenterkt.model.City
import com.shopping.center.kt.shoppingcenterkt.model.Country
import com.shopping.center.kt.shoppingcenterkt.repository.CityRepository
import com.shopping.center.kt.shoppingcenterkt.repository.CountryRepository
import org.junit.Assert
import org.junit.Test
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class CountryServiceTest {

    private val cityBuenosAires: City

    private val countryArgentina: Country

    private val mockCountryRepo: CountryRepository

    private val mockCityRepo: CityRepository

    private val countryService: CountryService


    init {
        cityBuenosAires = City(
                name = "Buenos Aires",
                orientation = "Center"
        )

        countryArgentina = Country(
                name = "Argentina",
                city = cityBuenosAires.name,
                continent = "South America"
        )
        mockCountryRepo = mock(CountryRepository::class.java)

        mockCityRepo = mock(CityRepository::class.java)
        countryService = CountryService(mockCountryRepo, mockCityRepo)
    }

    @Test
    fun `GIVEN country WHEN call addCountry THEN country saved`() {

        //GIVEN
        `when`(mockCountryRepo.save(any(Country::class.java))).thenReturn(countryArgentina)
        `when`(mockCityRepo.save(any(City::class.java))).thenReturn(cityBuenosAires)
        //WHEN
        val countryResult = countryService.addCountry(countryArgentina.name!!, countryArgentina.continent!!, cityBuenosAires.name)

        //THEN
        Assert.assertEquals(countryResult.name, countryArgentina.name)
        Assert.assertEquals(countryResult.city, cityBuenosAires.name)
        Mockito.verify(mockCountryRepo).save(any(Country::class.java))
        Mockito.verify(mockCityRepo).save(any(City::class.java))
    }

    @Test
    fun deleteCountryByName() {
        `when`(mockCountryRepo.save(any(Country::class.java))).thenReturn(countryArgentina)
        countryService.deleteCountryByName(countryArgentina.name!!)
        Mockito.verify(mockCountryRepo).save(any(Country::class.java))

    }

    @Test
    fun deleteAll() {

    }

    @Test
    fun findAll() {
    }

    @Test
    fun findByName() {
    }
}