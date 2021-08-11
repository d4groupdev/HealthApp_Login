package com.d.four.f.healthapp.di

import com.d.four.f.healthapp.feature.data.datasourse.LoginDataStore
import com.d.four.f.healthapp.feature.data.repository.LoginRepositoryImpl
import com.d.four.f.healthapp.feature.domain.interactor.GetLoginInteractor
import com.d.four.f.healthapp.feature.domain.reposirory.LoginApi
import com.d.four.f.healthapp.feature.presentation.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val postModule = module {

    //region ViewModel
    viewModel {
        LoginViewModel(get())
    }
    //region Interactor
    single {
        GetLoginInteractor(
            get()
        )
    }
    //region Repository
    single<LoginApi> {
        LoginRepositoryImpl(get())
    }
    single {
        LoginDataStore()
    }
}

val modulesArr = listOf(postModule)
