package com.example.quiz_kingdom.domain.entity

import javax.security.auth.callback.PasswordCallback

data class LoginState(
    var email: String,
    var password : String
)
