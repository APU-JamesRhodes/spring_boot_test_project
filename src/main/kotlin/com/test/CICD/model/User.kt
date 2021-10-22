package com.test.CICD.model

import com.test.CICD.utils.Request

data class User(
    val userId: Long,
    val userName: String,
    val userEmail: String,
    val userAddress: String
) : Request
