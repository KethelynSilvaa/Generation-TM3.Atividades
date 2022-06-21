package com.generation.todoappandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generation.todoappandroid.databinding.CardLayoutBinding
import com.generation.todoappandroid.model.Tarefa

class TarefaAdapter: RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder (val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]

        holder.binding.textName.text= tarefa.nomeTarefa
        holder.binding.textDescricao.text= tarefa.descricao
        holder.binding.textResposavel.text= tarefa.responsavel
        holder.binding.textData.text= tarefa.data
        holder.binding.switchEmAndameto.isChecked= tarefa.status
        holder.binding.textCategoria.text= tarefa.categoria.descricao
    }
    override fun getItemCount(): Int {
        return listTarefa.size
    }
    fun setlist(list:List<Tarefa>){
        listTarefa = list
        notifyDataSetChanged()
    }

    }
