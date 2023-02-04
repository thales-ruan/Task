package com.example.tarefas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tarefas.R
import com.example.tarefas.databinding.ActivityCriarTarefaBinding
import com.example.tarefas.databinding.ActivityMainBinding

class CriarTarefaActivity : AppCompatActivity() {

    lateinit var binding: ActivityCriarTarefaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriarTarefaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}