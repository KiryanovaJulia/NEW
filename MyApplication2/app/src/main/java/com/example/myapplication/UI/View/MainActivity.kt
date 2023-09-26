package com.example.myapplication.UI.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        val fragmentManager = supportFragmentManager
        setContentView(view)
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentcontainer, LogInFragment.newInstance("",""))
        transaction.addToBackStack(null)
        transaction.commit()

        }

}