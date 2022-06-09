package com.generation.todoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generation.todoapp.databinding.CardLayoutBinding
import com.generation.todoapp.databinding.FragmentFormBinding
import com.generation.todoapp.model.Tarefa

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder> (){

    private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder(val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]

        holder.binding.textView.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text = tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switchAtivo.isChecked= tarefa.status
        holder.binding.textCategoria.text= tarefa.categoria
    }

    override fun getItemCount(): Int {
        return listTarefa.size
    }
    fun setlist (list: List<Tarefa>){
        listTarefa=list
        notifyDataSetChanged()
    }

}