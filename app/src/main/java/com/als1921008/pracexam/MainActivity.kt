package com.als1921008.pracexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.als1921008.pracexam.view.RVadapter
import com.als1921008.pracexam.viewmodel.MViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var context : Context
    private lateinit var viewModel : MViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RVadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this

        recyclerView = findViewById(R.id.rv_main)
        viewModel = ViewModelProvider(this).get(MViewModel::class.java)
        viewModel.userLiveData.observe(this){
            recyclerViewAdapter = RVadapter(it)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = recyclerViewAdapter
        }
        viewModel.load()
    }
    fun onClicked(v: View){
        viewModel.addButtonClicked()
    }
}