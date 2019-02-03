package com.shopping.center.kt.shoppingcenterkt.repository

import com.shopping.center.kt.shoppingcenterkt.model.City
import com.shopping.center.kt.shoppingcenterkt.model.Country
import org.springframework.data.repository.CrudRepository

interface CityRepository:CrudRepository<City,String>

interface CountryRepository:CrudRepository<Country,String>