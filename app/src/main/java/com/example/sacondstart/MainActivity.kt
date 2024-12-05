package com.example.sacondstart

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sacondstart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    
  lateinit  var binding: ActivityMainBinding
  lateinit var adaptor: adaptor
  lateinit var something_to_do:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       adaptor= adaptor(something_to_do = something_to_do)



        binding.rec.adapter=adaptor

      binding.addButton.setOnClickListener {
          addItem(binding.name.toString())
      }


        }

    private fun addItem(item: String) {
        // on below line we are checking
        // if item is empty or not.
        if (item.isNotEmpty()) {
            // on below line we are
            // adding item to our list
            something_to_do.plusAssign(item)
            // on below line we are notifying
            // adapter that data has updated.
            this.adaptor.notifyDataSetChanged()
        }
    }


}