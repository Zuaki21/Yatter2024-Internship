package com.dmm.bootcamp.yatter2024.ui.login

data class LoginUiState(
    val loginBindingModel: LoginBindingModel,
    val isLoading: Boolean,
    val validUsername: Boolean,
    val validPassword: Boolean,
){
    val isEnableLogin: Boolean = validUsername && validPassword

    //初期化用
    companion object {
        fun empty(): LoginUiState = LoginUiState(
            loginBindingModel = LoginBindingModel(
                username = "",
                password = ""
            ),
            validUsername = false,
            validPassword = false,
            isLoading = false,
        )
    }
}