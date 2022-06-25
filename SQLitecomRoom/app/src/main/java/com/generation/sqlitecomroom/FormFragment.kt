package com.generation.sqlitecomroom

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.generation.sqlitecomroom.data.Usuario
import com.generation.sqlitecomroom.databinding.FragmentFormBinding


class FormFragment : Fragment() {


    private lateinit var binding: FragmentFormBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentFormBinding.inflate(layoutInflater, container, false )

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.buttonAdd.setOnClickListener {
            inserirNoaBanco()
        }
        return binding.root
    }
    fun verificarCampos(nome: String, sobrenome: String, idade:String): Boolean{
        return !(nome == "" || sobrenome == "" || idade == "" )
    }

    fun inserirNoaBanco(){
        val nome = binding.editNome.text.toString()
        val sobrenome = binding.editSobrenome.text.toString()
        val idade = binding.editIdade.text.toString()

        if (verificarCampos(nome, sobrenome, idade)){
            val user = Usuario(0, nome,sobrenome,idade.toInt())
            mainViewModel.addUser(user)
            Toast.makeText(context, "Usuario Adicionado",Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        } else {
            Toast.makeText(context,"Preencha todos os Campos", Toast.LENGTH_LONG).show()
        }
    }
            }