package com.example.praktika_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.praktika_3.databinding.SecondActivityBinding

import java.io.File

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val path = this.getExternalFilesDir(null)
        val file = File(path, "date.txt")
        val data = file.readText().split(';')
        val adapter = Adapter(data)
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
    }
}