package com.shopping.center.kt.shoppingcenterkt.service

import com.shopping.center.kt.shoppingcenterkt.model.City
import com.shopping.center.kt.shoppingcenterkt.model.Country
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito

class CountryServiceTest() {

    private val countryArgentina = Country(
            name = "Argentina",
            continent = "South America",
            city = listOf(
                    City(
                            name = "Buenos Aires",
                            orientation = "Center"
                    )
            )
    )

    @Before
    fun setUp() {

    }

    @Test
    fun `Add country with one city`() {
        val mockitoCountryService = Mockito.mock(CountryService::class.java)
        Mockito.`when`(mockitoCountryService.addCountry(ArgumentMatchers.anyString(), ArgumentMatchers.anyString(), ArgumentMatchers.anyString()))
                .thenReturn(countryArgentina)
        val resultCountry = mockitoCountryService.addCountry("Argentina", "South America", "Buenos Aires")
        Assert.assertNotNull(resultCountry)
        Assert.assertEquals("Argentina", resultCountry.name)
        Assert.assertEquals("Buenos Aires", resultCountry.city.first().name)
        Mockito.verify(mockitoCountryService).addCountry(ArgumentMatchers.anyString(), ArgumentMatchers.anyString(), ArgumentMatchers.anyString())
    }

}