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

        users.add(User("BREAD", "Port Harcourt" ))
        users.add(User("MILK", "Port Harcourt" ))
        users.add(User("BUTTER", "Port Harcourt" ))
        users.add(User("SARDINES", "Port Harcourt" ))
        users.add(User("CAKE", "Port Harcourt" ))
        users.add(User("TEA BAGS", "Port Harcourt" ))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }
}
