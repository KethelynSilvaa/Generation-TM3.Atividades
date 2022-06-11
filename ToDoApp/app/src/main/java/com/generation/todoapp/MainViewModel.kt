package com.generation.todoapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todoapp.api.Repository
import com.generation.todoapp.model.Categoria
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
    ): ViewModel (){


    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse :LiveData<Response<List<Categoria>>> = _myCategoriaResponse

    init {
        listCategoria()
    }
    fun listCategoria(){
        viewModelScope.launch {
            _myCategoriaResponse.value= repository.listCategoria()
            try {

                val response = repository.listCategoria()
                _myCategoriaResponse.value= response


            }catch (e: Exception ){
                Log.d("Error", e.message.toString())
            }

        }
    }

}