package br.com.tiagolivrera.SpringKotlin.exceptions

import java.util.*

class ResponseException (
    val timestamp: Date,
    val message: String?,
    val details: String
    )