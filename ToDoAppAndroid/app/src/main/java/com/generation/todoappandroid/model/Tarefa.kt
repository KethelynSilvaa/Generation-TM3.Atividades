package com.generation.todoappandroid.model
// Classe do objeto CardTarefas
data class Tarefa (
    var id: Long,
    var nomeTarefa: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: Categoria){

}