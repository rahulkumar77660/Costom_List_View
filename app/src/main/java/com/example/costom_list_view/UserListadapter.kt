package com.example.costom_list_view

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class UserListadapter (val context: Context, val userArray: Array<UserModel>): BaseAdapter(){
    override fun getCount(): Int {
        return userArray.size
    }

    override fun getItem(p0: Int): Any {
        return userArray[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("ViewHolder", "MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val layout = LayoutInflater.from(context).inflate(R.layout.user_list_item,p2,false)
        val nameText = layout.findViewById<TextView>(R.id.nameText)
        val ageText = layout.findViewById<TextView>(R.id.ageText)
        val image = layout.findViewById<ImageView>(R.id.imageview)

        nameText.text = userArray[p0].name
        ageText.text = userArray[p0].age.toString()
        image.setImageResource(userArray[p0].Image)

        layout.setOnClickListener(){
            val infalate= LayoutInflater.from(context).inflate(R.layout.rowdisgn,p2,false)
            val text=infalate.findViewById<TextView>(R.id.nametoast)
            val image1=infalate.findViewById<ImageView>(R.id.imagetoast)
            text.text=userArray[p0].name
            image1.setImageResource(userArray[p0].Image)

            val toast= Toast.makeText(context,userArray[p0].name, Toast.LENGTH_SHORT)

            toast.view=infalate
            toast.show()

        }


        return layout


    }

}