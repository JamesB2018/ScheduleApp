package com.example.james.schedule

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.Button1)

//sets button to intent which directs it to --> SchedulePage
        button.setOnClickListener({
            button.setOnClickListener {
                startActivity(Intent(this@MainActivity, WeekActivity::class.java))

            }

        })


    }

}



