package com.generation.todoapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.DatePicker
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generation.todoapp.databinding.FragmentFormBinding
import com.generation.todoapp.databinding.FragmentListBinding
import com.generation.todoapp.fragment.DataPickerFragment
import com.generation.todoapp.fragment.TimePickerListener
import com.generation.todoapp.model.Categoria
import java.time.LocalDate


class FormFragment : Fragment(), TimePickerListener{

    private lateinit var binding: FragmentFormBinding
    private val mainViewModel: MainViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

        mainViewModel.listCategoria()

        mainViewModel.dataSelecao.value = LocalDate.now()

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
            response -> Log.d("Requisição", response.body().toString())
            spinnerCategoria(response.body())
        }

        mainViewModel.dataSelecao.observe(viewLifecycleOwner){
            selectedDate -> binding.editData.setText(selectedDate.toString())
        }

        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

            binding.editData.setOnClickListener{
                DataPickerFragment(this).show(parentFragmentManager, "DatePicker")
            }



        return binding.root
    }

    fun spinnerCategoria (listCategoria: List<Categoria>?){
        if (listCategoria != null)
            binding.spinnerCategoria.adapter= ArrayAdapter(
                requireContext(),
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                listCategoria
            )
    }

    override fun onDAteSelected(date: LocalDate) {
        mainViewModel.dataSelecao.value=date
    }


}

