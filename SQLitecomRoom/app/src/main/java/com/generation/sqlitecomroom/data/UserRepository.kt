package com.generation.sqlitecomroom.data

import com.generation.sqlitecomroom.data.UserDao
import com.generation.sqlitecomroom.data.Usuario

class UserRepository (private val userDao: UserDao){

    val selectUsers= userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}