package com.learn.bookreader.screens.login

import android.graphics.Outline
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.learn.bookreader.components.EmailInput
import com.learn.bookreader.components.PasswordInput
import com.learn.bookreader.components.ReaderLogoText


@Composable
    fun ReaderLoginScreen(navController: NavHostController) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top) {
                ReaderLogoText()
                UserForm(loading = false, isCreateAccount = false){
                    email,password ->
                    Log.d("email pa",email+" "+password)
                }
            }
        }


    }
@OptIn(ExperimentalComposeUiApi::class)
@Preview
@Composable
fun UserForm(
    loading:Boolean=false,
    isCreateAccount:Boolean=false,
    onDone: (String,String) -> Unit={email,pwd->}
){
    val email= rememberSaveable() {
        mutableStateOf("")
    }
    val password= rememberSaveable() {
        mutableStateOf("")
    }

    val passwordVisibility=rememberSaveable() {
        mutableStateOf(false)
    }

    val passwordFocusRequest = FocusRequester.Default
    val keyboardController = LocalSoftwareKeyboardController.current

    val valid  = remember(email.value,password.value) {
        email.value.trim().isNotEmpty() && password.value.trim().isNotEmpty()
    }

    val modifier= Modifier
        .height(250.dp)
        .background(MaterialTheme.colorScheme.background)
        .verticalScroll(rememberScrollState())
    
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally,) {
        EmailInput(emailState = email, enabled = !loading, onAction = KeyboardActions{passwordFocusRequest.requestFocus()})

    }

    PasswordInput(modifier=modifier.focusRequester(passwordFocusRequest)
        ,passwordState=password,
        labelId="Password",

        enabled=!loading,
        passwordVisibility=passwordVisibility,
        onAction=KeyboardActions {
            if(!valid) return@KeyboardActions
            // onDone(email.value.trim() , password.value.trim())
        },

        )






}

