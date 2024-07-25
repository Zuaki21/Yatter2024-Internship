package com.dmm.bootcamp.yatter2024.ui.register

import com.dmm.bootcamp.yatter2024.ui.login.LoginBindingModel

data class RegisterUiState(
    val registerBindingModel: RegisterBindingModel,
    val isLoading: Boolean,
    val validUsername: Boolean,
    val validPassword: Boolean,
){
    val isEnableRegister: Boolean = validUsername && validPassword

    //初期化用
    companion object {
        fun empty(): RegisterUiState = RegisterUiState(
            registerBindingModel = RegisterBindingModel(
                username = "",
                password = ""
            ),
            validUsername = false,
            validPassword = false,
            isLoading = false,
        )
    }
}