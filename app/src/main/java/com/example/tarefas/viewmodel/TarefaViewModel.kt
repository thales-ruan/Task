package com.example.tarefas.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.tarefas.room.TarefaDataBase
import com.example.tarefas.room.TarefaModel
import com.example.tarefas.room.TarefaRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TarefaViewModel (application: Application) : AndroidViewModel(application){

    val tarefaDao = TarefaDataBase.getDataBase(application).tarefaDao()
    val repository: TarefaRepository = TarefaRepository(tarefaDao)
    val todasTarefas: LiveData<List<TarefaModel>> = repository.todasTarefas

    //TODO IMPREMENTAR O INIT NESSAS VARIAVEIS


    fun inserirTarefa(tarefa: TarefaModel) = viewModelScope.launch(Dispatchers.IO) {
        repository.inserirTarefa(tarefa)
    }

    fun atualizarTarefa(tarefa: TarefaModel) = viewModelScope.launch(Dispatchers.IO) {
        repository.atualizartarefa(tarefa)
    }

    fun excluirTarefa(tarefa: TarefaModel) = viewModelScope.launch(Dispatchers.IO) {
        repository.excluirTarefa(tarefa)
    }
}