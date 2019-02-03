package com.shopping.center.kt.shoppingcenterkt.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class City(
        @Id
        var name: String,
        var orientation: String
)