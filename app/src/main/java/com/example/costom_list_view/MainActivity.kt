package com.example.costom_list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val array = arrayOf(
            UserModel("Rahul", 18, R.drawable.o),
            UserModel("Rahul", 18, R.drawable.o),
            UserModel("Rahul", 18, R.drawable.o),
            UserModel("Rahul", 18, R.drawable.o),
            UserModel("Rahul", 17, R.drawable.o),
            UserModel("Rahul", 17, R.drawable.o),
            UserModel("Rahul", 16, R.drawable.o),
            UserModel("Rahul", 16, R.drawable.o),
            UserModel("Rahul", 19, R.drawable.o),
            UserModel("Rahul", 19, R.drawable.o),
            UserModel("Rahul", 17, R.drawable.o),
            UserModel("Rahul", 17, R.drawable.o),
            UserModel("Rahul", 19, R.drawable.o),
            UserModel("Rahul", 19, R.drawable.o),


            )
        val UserList: ListView = findViewById<ListView>(R.id.ListView)
        val adapter = UserListadapter(this,array)
        UserList.adapter =adapter


    }
}