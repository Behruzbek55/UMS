package com.example.ums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ums.databinding.ActivityMainBinding
import com.example.ums.models.MyUms
import com.example.ums.utils.MyData

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MyData.addUms()
    }
}