package com.shopping.center.kt.shoppingcenterkt.repository

import com.shopping.center.kt.shoppingcenterkt.model.Country
import org.springframework.data.repository.CrudRepository

interface CountryRepository: CrudRepository<Country, String> {
    fun deleteByName(nameParam: String)
    fun findByName(nameParam: String): Country
}
