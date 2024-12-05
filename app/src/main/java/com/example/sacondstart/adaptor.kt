package com.example.sacondstart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView

class adaptor(
    private  var something_to_do:ArrayList<String>
):RecyclerView.Adapter<adaptor.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): adaptor.ViewHolder {
        // this method is use to inflate the layout file
        // which we have created for our recycler view.
        // on below line we are inflating our layout file.
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_main,
            parent, false
        )
        // at last we are returning our view holder
        // class with our item View File.
        return adaptor.ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: adaptor.ViewHolder, position: Int) {
        // on below line we are setting text to our text view.
        holder.check.text = something_to_do.get(position)
    }

    override fun getItemCount(): Int {
        // on below line we are
        // returning the size of list.
        return something_to_do.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // on below line we are initializing our text view.
        val check: CheckBox = itemView.findViewById(R.id.checkBox)
    }

}
