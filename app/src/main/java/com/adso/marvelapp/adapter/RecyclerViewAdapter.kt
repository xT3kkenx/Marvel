package com.adso.marvelapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.viewmodel.savedstate.R
import androidx.recyclerview.widget.RecyclerView
import com.adso.marvelapp.model.Superheroe
import com.bumptech.glide.Glide
import java.net.URL

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    var superheroe: MutableList<Superheroe> = ArrayList()
    lateinit var context: Context

    fun RecyclerViewAdapter(superheroe: MutableList<Superheroe>,context: Context){
        this.superheroe=superheroe
        this.context=context
    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(context).inflate(com.adso.marvelapp.R.layout.item_superheroe, parent, false ))

    }

    override fun getItemCount(): Int {
       return superheroe.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = superheroe.get(position)
        //holder.bindingAdapterPosition
        holder.bind(item, context)
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
         val superheroeName = view.findViewById<TextView>(com.adso.marvelapp.R.id.tvSuperhero)

        val realName = view.findViewById<TextView>(com.adso.marvelapp.R.id.tvRealName)

        val publisher = view.findViewById<TextView>(com.adso.marvelapp.R.id.tvPublisher)

        val foto = view.findViewById<ImageView>(com.adso.marvelapp.R.id.ivAvatar)

        fun bind(superheroe: Superheroe, context: Context){
            superheroeName.text = superheroe.nombre

            realName.text = superheroe.nombreReal

            publisher.text = superheroe.publisher

            foto.loadImage(superheroe.foto)

        }
        fun ImageView.loadImage(url: String){

            Glide.with(context).load(url).into(this)

        }
    }


}




