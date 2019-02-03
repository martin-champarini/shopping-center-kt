package com.shopping.center.kt.shoppingcenterkt.model

import java.util.*
import javax.persistence.Entity

//@Entity
class UserSession(
        var status: String,
        var description: String,
        var startDate: Date,
        var endDate: Date
)