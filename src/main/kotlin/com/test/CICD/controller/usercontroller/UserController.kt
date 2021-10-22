package com.test.CICD.controller.usercontroller

import com.test.CICD.model.User
import com.test.CICD.services.UserService
import com.test.CICD.utils.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/")
class UserController : UserRequest {


    @Autowired
    private lateinit var userService: UserService

    @PostMapping("/add")
    override fun addUserBy(@RequestBody user: User): Response {
        return userService.addUser(user)
    }

    @GetMapping("/user/{id}")
    override fun getUserById(@PathVariable id: String): Response {
        return userService.getUserById(id.toLong())
    }

    @DeleteMapping("user/delete/{id}")
    override fun deleteUserById(@PathVariable id: String): Response {
        return userService.deleteUser(id.toLong())
    }
}