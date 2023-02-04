package com.example.tarefas.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tarefa")
class TarefaModel {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "priorityId")
    var priorityId: Int = 0

    @ColumnInfo(name = "description")
    var description: String = ""

    @ColumnInfo(name = "data")
    var data: String = ""

    @ColumnInfo(name = "complete")
    var complete: Boolean = false
}