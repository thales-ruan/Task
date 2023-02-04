package com.example.tarefas.room

import androidx.lifecycle.LiveData

class TarefaRepository(private val tarefaDao: TarefaDao) {

    val todasTarefas: LiveData<List<TarefaModel>> = tarefaDao.listarTodas()

    suspend fun inserirTarefa(tarefa: TarefaModel) {
        tarefaDao.salvar(tarefa)
    }

    suspend fun atualizartarefa(tarefa: TarefaModel) {
        tarefaDao.atualizarTarefa(tarefa)
    }

    suspend fun excluirTarefa(tarefa: TarefaModel) {
        tarefaDao.excluirTarefa(tarefa)
    }

}