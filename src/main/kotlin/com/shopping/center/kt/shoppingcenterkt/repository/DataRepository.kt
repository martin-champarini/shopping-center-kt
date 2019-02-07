package com.shopping.center.kt.shoppingcenterkt.repository

import com.shopping.center.kt.shoppingcenterkt.model.City
import com.shopping.center.kt.shoppingcenterkt.model.Country
import com.shopping.center.kt.shoppingcenterkt.model.Order
import com.shopping.center.kt.shoppingcenterkt.model.Product
import com.shopping.center.kt.shoppingcenterkt.model.StatusOrder
import com.shopping.center.kt.shoppingcenterkt.model.User
import com.shopping.center.kt.shoppingcenterkt.model.UserSession
import org.springframework.data.repository.CrudRepository

interface CityRepository:CrudRepository<City, String>

interface CountryRepository:CrudRepository<Country, String>

interface OrderRepository:CrudRepository<Order, Long>

interface ProductRepository:CrudRepository<Product, Long>

interface StatusOrderRepository:CrudRepository<StatusOrder, String>

interface UserSessionRepository:CrudRepository<UserSession, String>

interface UserRepository:CrudRepository<User, String>