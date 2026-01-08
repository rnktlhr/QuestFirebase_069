package com.example.firebase.viewmodel

import com.example.firebase.modeldata.Siswa
import kotlinx.serialization.InternalSerializationApi
import kotlinx.coroutines.launch
import java.io.IOException
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firebase.repositori.RepositorySiswa
import com.example.firebase.view.route.DestinasiDetail

@file:OptIn(InternalSerializationApi::class)


sealed interface StatusUIDetail {
    data class Success(val satusisswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

