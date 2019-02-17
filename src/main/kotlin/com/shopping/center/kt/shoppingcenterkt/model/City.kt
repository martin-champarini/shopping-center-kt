package com.shopping.center.kt.shoppingcenterkt.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class City (

        @Id
        val name: String,

        @ManyToOne
        @JoinColumn(name = "name", updatable = false, insertable = false)
        val country: Country? = null,

        val orientation: String? = null

): Serializable