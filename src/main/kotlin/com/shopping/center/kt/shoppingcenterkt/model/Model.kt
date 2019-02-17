package com.shopping.center.kt.shoppingcenterkt.model

import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.CascadeType.*
import javax.persistence.Column
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.OneToOne





//@Entity
//@Table(name = "PRODUCT")
//data class Product (
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        val id: Long,
//
//        val description: String? = null,
//
//        val price: Double,
//
//        val name: String,
//
//        @OneToMany(cascade = [ALL], mappedBy = "name")
//        val originCountry: Country
//
//): Serializable

//@Entity
//@Table(name = "ORDER")
//data class Order (
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        val id: Long,
//
//        @ManyToOne(cascade = [ALL], fetch = FetchType.LAZY)
//        val user: User,
//
//        @ManyToMany(cascade = [MERGE, PERSIST])
//        @JoinTable(name = "id")
//        val products: Set<Product>,
//
//        @OneToOne(cascade = [ALL], mappedBy = "status")
//        val statusOrder: StatusOrder,
//
//        val orderDate: Date
//
//): Serializable
//
//@Entity
//@Table(name = "USER")
//data class User (
//
//        @Id
//        val username: String,
//
//        val password: String,
//
//        @OneToOne(cascade = [ALL], mappedBy = "status")
//        val session: UserSession
//
//): Serializable
//
//
//@Entity
//@Table(name = "USER_SESSION")
//data class UserSession (
//
//        @Id
//        val status: String,
//
//        val description: String,
//
//        val startTime: Date,
//
//        val endTime: Date
//
//): Serializable
//
//@Entity
//@Table(name = "STATUS_ORDER")
//data class StatusOrder(
//
//        @Id
//        val status: String,
//
//        val description: String
//
//): Serializable
