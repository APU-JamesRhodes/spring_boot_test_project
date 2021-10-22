package com.test.CICD

import com.test.CICD.controller.usercontroller.UserController
import com.test.CICD.model.User
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CicdApplicationTests {

    @Autowired
    private lateinit var userController: UserController

    @Test
    fun contextLoads() {
    }

    @Test
    fun addUser() {
        println(
            userController.addUserBy(
                User(
                    12L,
                    "hjsdjghs",
                    "bhjdfv bgdk d",
                    "dgbkhjsvbks"
                )
            )
        )
    }

    @Test
    fun getUserById() {
        println(
            userController.getUserById(
                "1"
            )
        )
    }

    @Test
    fun deleteUserById() {
        println(
            userController.deleteUserById(
                "1"
            )
        )
    }

}
