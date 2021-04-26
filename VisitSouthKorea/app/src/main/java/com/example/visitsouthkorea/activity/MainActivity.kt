package com.example.visitsouthkorea.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.visitsouthkorea.adapter.CityAdapter
import com.example.visitsouthkorea.databinding.ActivityMainBinding
import com.example.visitsouthkorea.entity.DataKorea

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val koreas = DataKorea.generateCity()
        val cityAdapter = CityAdapter()
        cityAdapter.setKorea(koreas)

        with(binding){
            rvCity.layoutManager = GridLayoutManager(this@MainActivity, 2)
            rvCity.setHasFixedSize(true)
            rvCity.adapter = cityAdapter
        }

    }
}