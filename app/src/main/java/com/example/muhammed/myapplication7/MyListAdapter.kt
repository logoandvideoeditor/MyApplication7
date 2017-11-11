package com.example.muhammed.myapplication7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by muhammed on 11/7/17.
 */
class MyListAdapter(var mCtx:Context , var resource:Int,var items:List<Persons>)
    :ArrayAdapter<Persons>( mCtx , resource , items ){




    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater :LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )
        val imageView :ImageView = view.findViewById(R.id.imageView)
        var textView : TextView = view.findViewById(R.id.textView)
        var textView1 : TextView = view.findViewById(R.id.textView2)
        var textView2 : TextView = view.findViewById(R.id.textView3)



        var person : Persons = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(person.photo))
        textView.text = person.firstname
        textView1.text = person.lastname
        textView2.text = person.address




        return view
    }

}