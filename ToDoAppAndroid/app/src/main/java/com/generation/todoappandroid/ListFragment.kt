package com.generation.todoappandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.todoappandroid.adapter.TarefaAdapter
import com.generation.todoappandroid.adapter.TaskClickListner
import com.generation.todoappandroid.databinding.FragmentListBinding
import com.generation.todoappandroid.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment(), TaskClickListner {

    private lateinit var binding: FragmentListBinding
    private val mainViewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // O MenuInflater tem por objetivo ler um arquivo xml e criar os objetos correspondentes

        binding= FragmentListBinding.inflate(layoutInflater,container,false)

        mainViewModel.lisTarefa()


        //conf do RecyclerView na ListFragment- fará com que os Cards da lista fique em formato de lista
        val adapter = TarefaAdapter(this,mainViewModel)
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        binding.floatingAdd.setOnClickListener{
            mainViewModel.tarefaSelecionada = null
            findNavController().navigate(R.id.action_listFragment2_to_formFragment2)
        }
        mainViewModel.myTarefaResponse.observe(viewLifecycleOwner){
            response-> if (response.body() != null){
                adapter.setlist(response.body()!!)
            }
        }

        return binding.root
    }


    override fun onTaskClickListener(tarefa: Tarefa) {
        mainViewModel.tarefaSelecionada= tarefa
        findNavController().navigate(R.id.action_listFragment2_to_formFragment2)
    }

}


