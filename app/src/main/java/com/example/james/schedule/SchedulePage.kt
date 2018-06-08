package com.example.james.schedule

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.Button
import kotlinx.android.synthetic.main.schedule_main.*

class SchedulePage : AppCompatActivity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Get the view from activity_main.xml
        setContentView(R.layout.schedule_main)

        // Locate the button in activity_main.xml
        val button2 = findViewById<Button>(R.id.btn_calender)


        //sets button to intent which directs it to --> SchedulePage
        button2.setOnClickListener( {
            button2.setOnClickListener{
                startActivity(Intent(this@SchedulePage, MainActivity::class.java))
            }


        })
    }
}