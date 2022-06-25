package com.generation.sqlitecomroom.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generation.sqlitecomroom.data.Usuario
import com.generation.sqlitecomroom.databinding.CardLayoutBinding

class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var listUser= emptyList<Usuario>()

    class UserViewHolder(val bindind: CardLayoutBinding): RecyclerView.ViewHolder(bindind.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context),parent,false

        ))
    }
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = listUser[position]
        holder.bindind.textId.text= user.id.toString()
        holder.bindind.textNome.text= user.nome
        holder.bindind.textSobreNome.text= user.sobrenome
        holder.bindind.textIdade.text= user.idade.toString()
    }
    override fun getItemCount(): Int {
        return listUser.size
    }

    fun setList(list: List<Usuario>){
        listUser=list
        notifyDataSetChanged()
    }
}