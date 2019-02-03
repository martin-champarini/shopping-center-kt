package com.shopping.center.kt.shoppingcenterkt.model


import org.springframework.web.bind.support.SessionStatus
import javax.persistence.Entity

//@Entity
class User(
        val username: String,
        val password: String,
        var sessionStatus: SessionStatus
)