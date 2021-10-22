package com.test.CICD.controller.usercontroller

import com.test.CICD.model.User
import com.test.CICD.utils.Request
import com.test.CICD.utils.Response

interface UserRequest : Request {

    fun addUserBy(user: User): Response
    fun getUserById(id: String): Response
    fun deleteUserById(id: String): Response

}