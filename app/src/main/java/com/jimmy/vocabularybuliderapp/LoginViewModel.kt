package com.jimmy.vocabularybuliderapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class LoginViewModel : ViewModel () {
    //This creates an authenticationState variable based on the FirebaseUserLiveData
    //object. With this variable, other classes can now query for whether
    // a user is logged in or not through the LoginViewModel.
    enum class AuthenticationState {
        AUTHENTICATED, UNAUTHENTICATED, INVALID_AUTHENTICATION
    }

    val authenticationState = FirebaseUserLiveData().map { user ->
        if (user != null) {
            AuthenticationState.AUTHENTICATED
        } else {
            AuthenticationState.UNAUTHENTICATED
        }
    }
}