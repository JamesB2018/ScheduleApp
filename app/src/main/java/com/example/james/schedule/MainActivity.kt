package com.example.james.schedule

import android.app.Fragment
import android.app.FragmentTransaction
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.widget.Button





class MainActivity : AppCompatActivity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main)

        // Locate the button in activity_main.xml
        val button = findViewById<Button>(R.id.Button1)


        //sets button to intent which directs it to --> SchedulePage
        button.setOnClickListener( {
            button.setOnClickListener{
                startActivity(Intent(this@MainActivity, SchedulePage::class.java))
            }


            })
        }

}



