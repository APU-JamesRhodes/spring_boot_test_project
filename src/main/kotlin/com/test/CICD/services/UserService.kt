package com.test.CICD.services

import com.test.CICD.model.User
import com.test.CICD.utils.Response
import org.springframework.stereotype.Service


@Service
class UserService {

    private final val userList: ArrayList<User> = ArrayList()

    init {
        userList.add(User(1L, "hjdbghj", "dfb", "hfsyjbg"))
        userList.add(User(2L, "hjdbghj", "dfb", "hfsyjbg"))
        userList.add(User(3L, "hjdbghj", "dfb", "hfsyjbg"))
        userList.add(User(4L, "hjdbghj", "dfb", "hfsyjbg"))
        userList.add(User(5L, "hjdbghj", "dfb", "hfsyjbg"))
        userList.add(User(6L, "hjdbghj", "dfb", "hfsyjbg"))
    }

    fun addUser(user: User): Response {
        userList.add(user)
        return Response("OK", "user added", user)
    }

    fun getUserById(id: Long): Response {
        return Response("OK", "ok", userList[id.toInt()])
    }

    fun deleteUser(id: Long): Response {
        val user = userList[id.toInt()]
        userList.remove(user)
        return Response("Ok", "user deleted", user)
    }


}