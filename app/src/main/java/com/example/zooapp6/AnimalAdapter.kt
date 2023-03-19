package com.example.zooapp6

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(val context: Context, val listofanimal : ArrayList<Animal>):RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){

        val Txt_name : TextView =itemView.findViewById(R.id.Txt_name)
        val Txt_des : TextView = itemView.findViewById(R.id.Txt_des)
        val Img_animal: ImageView = itemView.findViewById(R.id.Img_animal)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.listdesign,parent,false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.Txt_name.text = listofanimal[position].name
        holder.Txt_des.text = listofanimal[position].des
        listofanimal[position].img ?. let { holder.Img_animal.setImageResource(it) }

    }

    override fun getItemCount(): Int {

        return listofanimal.size
    }
}