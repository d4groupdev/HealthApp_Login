package com.d.four.f.healthapp.feature.data.repository

import com.d.four.f.healthapp.feature.domain.model.LoginUser
import com.d.four.f.healthapp.feature.data.datasourse.LoginDataStore
import com.d.four.f.healthapp.feature.domain.reposirory.LoginApi

class LoginRepositoryImpl (
    private val LoginDataStore: LoginDataStore
) : LoginApi {

    override suspend fun getToken(username: String, password: String): LoginUser = LoginDataStore.getTrends2(username, password)
}