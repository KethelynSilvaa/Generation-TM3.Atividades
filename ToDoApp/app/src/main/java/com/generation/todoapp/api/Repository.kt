package com.generation.todoapp.api

import com.generation.todoapp.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria():Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }
}