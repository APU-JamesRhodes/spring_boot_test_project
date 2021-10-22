package com.test.CICD.utils

data class Response(
    val status: String,
    val message: String,
    val data: Request
)
