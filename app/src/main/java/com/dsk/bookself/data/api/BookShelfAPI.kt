package com.dsk.bookself.data.api

import com.dsk.bookself.data.model.Books
import retrofit2.Response
import retrofit2.http.GET

interface BookShelfAPI {

    @GET("books")
    suspend fun getTrendingRepo(): Response<List<Books>>
}