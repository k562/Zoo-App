package com.example.zooapp6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


  lateinit  var rec : RecyclerView
            var listofanimal = ArrayList<Animal>()
            var adapter : AnimalAdapter ?= null

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         rec = findViewById(R.id.Recyclerview)
         rec.setHasFixedSize(true)
         rec.layoutManager= LinearLayoutManager(this)


//        listofanimal.add(Animal("Baboon","It is an animal who can live with the other animals",R.drawable.baboon))
//        listofanimal.add(Animal("Bull dog","It is an animal who can live with the other animals", R.drawable.bulldog))
//        listofanimal.add(Animal("Panda","It is an animal who can live with the other animals", R.drawable.panda))
//        listofanimal.add(Animal("White tiger","It is an animal who can live with the other animals", R.drawable.white_tiger))
//        listofanimal.add(Animal("Zebra","It is an animal who can live with the other animals", R.drawable.zebra))
//        listofanimal.add(Animal("Swallo bird","It is an animal who can live with the other animals",R.drawable.swallow_bird))
//        listofanimal.add(Animal("Baboon","It is an animal who can live with the other animals",R.drawable.baboon))
//        listofanimal.add(Animal("Bull dog","It is an animal who can live with the other animals", R.drawable.bulldog))
//        listofanimal.add(Animal("Panda","It is an animal who can live with the other animals", R.drawable.panda))
//        listofanimal.add(Animal("White tiger","It is an animal who can live with the other animals", R.drawable.white_tiger))
//        listofanimal.add(Animal("Zebra","It is an animal who can live with the other animals", R.drawable.zebra))
//        listofanimal.add(Animal("Swallo bird","It is an animal who can live with the other animals",R.drawable.swallow_bird))

        adapter = AnimalAdapter(this,listofanimal)
        rec.adapter = adapter
        adapter!!.notifyDataSetChanged()

        
    }
}
