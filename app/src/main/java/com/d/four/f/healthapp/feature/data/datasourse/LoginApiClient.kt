package com.d.four.f.healthapp.feature.data.datasourse

import com.d.four.f.healthapp.core.network.BaseApiClient
import com.d.four.f.healthapp.feature.domain.reposirory.LoginApi


object LoginApiClient : BaseApiClient<LoginApi>(LoginApi::class.java)
