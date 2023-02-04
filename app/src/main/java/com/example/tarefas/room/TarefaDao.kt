package com.example.tarefas.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TarefaDao {

    @Insert
    suspend fun salvar(tarefa:TarefaModel)

    @Query("SELECT * FROM Tarefa")
    fun listarTodas(): LiveData<List<TarefaModel>>

    @Update
    suspend fun atualizarTarefa(tarefa:TarefaModel)

    @Delete
    suspend fun excluirTarefa(tarefa:TarefaModel)

}