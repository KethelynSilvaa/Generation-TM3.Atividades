package com.generation.todoappandroid

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.generation.todoappandroid.databinding.FragmentFormBinding
import com.generation.todoappandroid.fragment.DatePickerFragment
import com.generation.todoappandroid.fragment.TimerPickerLIstener
import com.generation.todoappandroid.model.Categoria
import com.generation.todoappandroid.model.Tarefa
import java.time.LocalDate

class FormFragment : Fragment(),TimerPickerLIstener {

    private lateinit var binding: FragmentFormBinding
    private val mainViewModel: MainViewModel by activityViewModels()
    private var categoriaSelecionada = 0L

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // O MenuInflater tem por objetivo ler um arquivo xml e criar os objetos correspondentes
        binding = FragmentFormBinding.inflate(layoutInflater,container,false )

        mainViewModel.listCategoria()

        mainViewModel.dataSelecionada.value = LocalDate.now()

        mainViewModel.myCAtegoriaResponse.observe(viewLifecycleOwner){
            response ->Log.d("Requisição", response.body().toString())
            spinnerCategoria(response.body())

        }

        mainViewModel.dataSelecionada.observe(viewLifecycleOwner){
            selectDate -> binding.editData.setText(selectDate.toString())}

        binding.buttonSalvar.setOnClickListener{
            inserirNoBanco()
        }

        binding.editData.setOnClickListener{
            DatePickerFragment(this).show(parentFragmentManager,"DatePicker")
        }

        return binding.root
    }

    private fun spinnerCategoria(listCategoria:List<Categoria>?){
        if (listCategoria != null){
            binding.spinnerCategoria.adapter =
                ArrayAdapter(
                    requireContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                    listCategoria
                )
            binding.spinnerCategoria.onItemSelectedListener=
                object : AdapterView.OnItemSelectedListener{
                    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                        val selected = binding.spinnerCategoria.selectedItem as Categoria

                        categoriaSelecionada = selected.id
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }
                }
        }

    }

    private fun validarCampos(nome: String, descricao:String, resposavel: String): Boolean{

        return !(
                (nome== ""|| nome.length <3 || nome.length >20) ||
                (descricao== ""|| descricao.length <3 || descricao.length >250) ||
                (resposavel== ""|| resposavel.length <3 || resposavel.length >20)
                )
    }

    private fun inserirNoBanco(){
        val nome = binding.editNome.text.toString()
        val desc = binding.editDescricao.text.toString()
        val resp = binding.editResponsavel.text.toString()
        val data = binding.editData.text.toString()
        val status = binding.switchAtivoCard.isChecked
        val categ = Categoria(categoriaSelecionada, null,null)

        if (validarCampos(nome,desc,resp)){
            val tarefa = Tarefa(0,nome,desc,resp,data,status,categ)
            mainViewModel.addTarefa(tarefa)
            Toast.makeText(context,"Tarefa Criada",Toast.LENGTH_LONG)
            findNavController().navigate(R.id.action_formFragment2_to_listFragment2)
        }else{
            Toast.makeText(context,"Verique os Campos",Toast.LENGTH_LONG)
        }
    }


    override fun onDateSelected(date: LocalDate) {
        mainViewModel.dataSelecionada.value = date
    }

}