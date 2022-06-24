package com.generation.todoappandroid

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todoappandroid.api.Repository
import com.generation.todoappandroid.model.Categoria
import com.generation.todoappandroid.model.Tarefa
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import java.time.LocalDate
import javax.inject.Inject

/*omponente de arquitetura servirá para guardar os dados/componentes
quando a tela "morrer"e activity ter acesso (viewmodels/persistir dados)
a liveData  informa a UI quando ha uma alteração da ViewModel*/
@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
        ) : ViewModel(){

    var tarefaSelecionada: Tarefa? = null

    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCAtegoriaResponse: LiveData<Response<List<Categoria>>> =
            _myCategoriaResponse

    private val _myTarefaRespose =
        MutableLiveData<Response<List<Tarefa>>>()

    val myTarefaResponse: LiveData<Response<List<Tarefa>>> =
        _myTarefaRespose

    val dataSelecionada = MutableLiveData<LocalDate>()

    init {
       // listCategoria()
    }

    fun listCategoria(){
        viewModelScope.launch (Dispatchers.IO){
            try {
                val response = repository.listCategoria()
                _myCategoriaResponse.value= response
            }catch (e: Exception){
                Log.d("Error", e.message.toString())
            }
        }
    }
    fun addTarefa(tarefa: Tarefa){
        viewModelScope.launch {
            try {
                repository.addTarefa(tarefa)
            }catch (e:Exception) {
                Log.d("Error", e.message.toString())
            }
        }
    }
    fun lisTarefa(){
        viewModelScope.launch {
            try {
                val response = repository.listTarefa()
                _myTarefaRespose.value = response
                lisTarefa()
            }catch (e:Exception){
                Log.d("Error", e.message.toString())
            }
        }
    }

    fun updateTarefa(tarefa: Tarefa){
        viewModelScope.launch {
            lisTarefa()
            try {
                    repository.updateTarefa(tarefa)
            }catch (e:Exception){
                Log.d("Error", e.message.toString())
            }
        }
    }


}