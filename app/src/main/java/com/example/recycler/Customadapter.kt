package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (val userlist: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder> (){

    class ViewHolder (itemView: View) :RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById(R.id.textviewname) as TextView
        val textViewAddress = itemView.findViewById(R.id.textviewaddress) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val user: User = userlist[position]

        holder.textViewName.text = user.name
        holder.textViewAddress.text = user.address
    }
}