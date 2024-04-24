package com.adso.marvelapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.adso.marvelapp.adapter.RecyclerViewAdapter
import com.adso.marvelapp.adapter.RecyclerViewAdapter2
import com.adso.marvelapp.data.DataSource
import com.adso.marvelapp.databinding.ActivityMainBinding
import com.adso.marvelapp.model.Superheroe
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    lateinit var miRecycler: RecyclerView

    val miAdapter: RecyclerViewAdapter = RecyclerViewAdapter()
    val miAdapter2:RecyclerViewAdapter2 = RecyclerViewAdapter2()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cargarRecycler()
        cargarRecycler2()
    }

    fun cargarRecycler(){
        miRecycler = binding.superheroe
        miRecycler.setHasFixedSize(true)
        miRecycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        miAdapter.RecyclerViewAdapter(DataSource().getSuperHeroe(), this)
        miRecycler.adapter = miAdapter
    }

    fun cargarRecycler2(){
        miRecycler = binding.superheroe2
        miRecycler.setHasFixedSize(true)
        miRecycler.layoutManager = LinearLayoutManager(this)
        miAdapter2.RecyclerViewAdapter2(DataSource().getSuperHeroe(), this)
        miRecycler.adapter = miAdapter2
    }

}










