package com.example.ifunsoedmobile.data.network

import com.example.ifunsoedmobile.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory // Added import

object RetrofitInstance {
    val api: OpenLibraryApi by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL) // Now resolved
            .addConverterFactory(GsonConverterFactory.create()) // Now resolved
            .build()
            .create(OpenLibraryApi::class.java)
    }
}