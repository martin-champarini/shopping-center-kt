package com.shopping.center.kt.shoppingcenterkt.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.CascadeType


@Entity
@Table(name = "`COUNTRY`")
data class Country (
        @Id
        val name: String,

        var continent: String,

        @OneToMany(cascade = [CascadeType.ALL], mappedBy = "name")
        var city: List<City>
): Serializable

@Entity
@Table(name = "`CITY`")
data class City (

        @Id
        var name: String,
        var orientation: String? = null
): Serializable