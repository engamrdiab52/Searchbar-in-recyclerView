package com.amrabdelhamiddiab.searchbarinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import com.amrabdelhamiddiab.searchbarinrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: EpoxyRecyclerView
    private lateinit var layoutManager: LinearLayoutManager
    private val myList = listOf("0", "1","2","3","4","5","6","7")
    private val homeEpoxyController by lazy {
        HomeEpoxyController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView = binding.recyclerViewHome
        recyclerView.adapter = homeEpoxyController.adapter
        layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager


    }

    override fun onResume() {
        super.onResume()
        homeEpoxyController.setData(myList)
    }
}