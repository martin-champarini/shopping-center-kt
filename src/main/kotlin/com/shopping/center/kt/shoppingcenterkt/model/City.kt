package com.shopping.center.kt.shoppingcenterkt.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "`CITY`")
data class City(
        @Id
        var name: String,
        var orientation: String
)