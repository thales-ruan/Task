package com.example.tarefas.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TarefaModel::class], version = 1)
abstract class TarefaDataBase: RoomDatabase() {

    abstract fun tarefaDao(): TarefaDao

    companion object{

        private lateinit var INSTANCE: TarefaDataBase

        fun getDataBase(context: Context):TarefaDataBase{

            if (!Companion::INSTANCE.isInitialized){
                synchronized(TarefaDataBase::class){
                    INSTANCE = Room.databaseBuilder(context,TarefaDataBase::class.java,"tarefasDB")
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }

    }

}