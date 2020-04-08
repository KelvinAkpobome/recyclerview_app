package com.example.recycler

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.shopping_list) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false )

        val users = ArrayList<User>()

        users.add(User("Akpobome Oke", "Port Harcourt" ))
        users.add(User("Akpobome Oke", "Port Harcourt" ))
        users.add(User("Akpobome Oke", "Port Harcourt" ))
        users.add(User("Akpobome Oke", "Port Harcourt" ))
        users.add(User("Akpobome Oke", "Port Harcourt" ))
        users.add(User("Akpobome Oke", "Port Harcourt" ))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }
}
