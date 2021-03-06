package com.jalgoarena.utils

import com.jalgoarena.data.XodusUsersRepository
import com.jalgoarena.domain.Role
import com.jalgoarena.domain.User

class UserDetailsStoreSetup {

    fun createDb() {

        val repository = XodusUsersRepository()
        try {
            repository.add(User(
                    username = "admin",
                    password = "<password>",
                    email = "admin@mail.com",
                    region = "Krakow",
                    team = "Admins",
                    role = Role.ADMIN
            ))
        } finally {
            repository.destroy()
        }
    }
}

fun main(args: Array<String>) {
    UserDetailsStoreSetup().createDb()
}

