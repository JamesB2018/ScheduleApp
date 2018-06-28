package com.example.james.schedule

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.schedule_main.*

class SchedulePage : AppCompatActivity(), View.OnClickListener {

    lateinit var editText: EditText
    lateinit var button2: Button
    lateinit var textViewMessage: TextView

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Get the view from activity_main.xml
        setContentView(R.layout.schedule_main)

        // Locate the button in activity_main.xml
        //val button2 = findViewById<Button>(R.id.btn_calender)
        button2 = findViewById(R.id.btn_calender)
        editText = findViewById(R.id.editText)
        textViewMessage = findViewById(R.id.lv_android)

        //sets button to intent which directs it to --> CalendarPage
        //button2.setOnClickListener( {
           // button2.setOnClickListener{
                //startActivity(Intent(this@SchedulePage, MainActivity::class.java))
           // }

       // })
        button2.setOnClickListener(this)
    }
    override fun onClick(view: View?){
        val peach = editText.text
        textViewMessage.text = "Your schedule is $peach"

    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
       // outState?.putString("textKey", editText.getText().toString())
    }


}