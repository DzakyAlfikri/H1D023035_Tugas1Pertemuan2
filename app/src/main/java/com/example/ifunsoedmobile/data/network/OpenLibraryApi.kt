package com.example.ifunsoedmobile.data.network

import com.example.ifunsoedmobile.data.model.SearchResponse
import retrofit2.Response // Changed from okhttp3.Response
import retrofit2.http.GET   // Added this import
import retrofit2.http.Query

interface OpenLibraryApi {

    @GET("search.json")
    suspend fun searchBooks(
        @Query("q") query: String,
        @Query("limit") limit: Int
    ): Response<SearchResponse>
}