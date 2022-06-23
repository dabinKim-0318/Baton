package com.depromeet.baton.domain.model

import androidx.annotation.Keep

@Keep
data class UserInfo (
    val userIdx : Int,
    val name : String,
    val phoneNumber : String,
    val joinDate : String,
    val account : Account?
){
    data class Account(
        val holder : String?="",
        val bank : String?="",
        val number : String?=""
    )
}

