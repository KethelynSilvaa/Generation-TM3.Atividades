package com.generation.todoapp.api

import com.generation.todoapp.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>

}