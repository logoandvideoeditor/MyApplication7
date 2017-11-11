package com.example.muhammed.myapplication7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView1)
        var list = mutableListOf<Persons>()

 list.add(Persons("Muhammed" , "Essa"  ,"Kirkuk" , R.drawable.person1  ))
list.add(Persons("Ahmed" , "Walid"  ,"Baghdad" , R.drawable.person2  ))
list.add(Persons("Osama" , "Samir"  ,"Erbil" , R.drawable.person3  ))
list.add(Persons("Ali" , "Mahmood"  ,"Sulymaniya" , R.drawable.person4  ))
list.add(Persons("Omer" , "Sami"  ,"Wasit" , R.drawable.person5  ))


        val adapter = MyListAdapter(this,R.layout.my_list_item,list)

        listView.adapter = adapter

    }
}
