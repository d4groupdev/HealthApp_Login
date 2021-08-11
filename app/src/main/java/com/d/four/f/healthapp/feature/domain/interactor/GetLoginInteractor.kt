package com.d.four.f.healthapp.feature.domain.interactor

import com.d.four.f.healthapp.core.interactor.Interactor
import com.d.four.f.healthapp.feature.domain.model.LoginUser
import com.d.four.f.healthapp.feature.domain.reposirory.LoginApi

class GetLoginInteractor(
    private val loginApi: LoginApi
) : Interactor<Interactor.None, Any> {

    override suspend fun execute(username: String, password: String, params: Interactor.None): LoginUser {
        return loginApi.getToken(username, password)
    }


}