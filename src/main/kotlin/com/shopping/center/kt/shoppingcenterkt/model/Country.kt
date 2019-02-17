package com.shopping.center.kt.shoppingcenterkt.model

import java.io.Serializable
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Country (

        val name: String? = null,

        val continent: String? = null,

        @Id
        val city: String? = null,

        @OneToMany(cascade = [CascadeType.ALL], mappedBy = "country")
        val cities: Set<City>? = null

): Serializable
