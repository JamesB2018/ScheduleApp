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

class MainActivity2 : AppCompatActivity() {

    private var toolbar: Toolbar? = null
    private var listView: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        setupUIViews()
        initToolbar()
        setupListView()
    }

    private fun setupUIViews() {
        toolbar = findViewById(R.id.ToolbarMain) as? Toolbar
        listView = findViewById(R.id.lvMain) as? ListView
    }

    private fun initToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Schedule App"
    }

    private fun setupListView() {

        val title = resources.getStringArray(R.array.Main)
        val description = resources.getStringArray(R.array.Description)

        val simpleAdapter = SimpleAdapter(this, title, description)
        listView!!.adapter = simpleAdapter

        listView!!.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@MainActivity2, WeekActivity::class.java)
                    startActivity(intent)
                }
                1 -> {
                }
                2 -> {
                }
                3 -> {
                }
            }
        }
    }

    inner class SimpleAdapter(private val mContext: Context, private val titleArray: Array<String>, private val descriptionArray: Array<String>) : BaseAdapter() {
        private val layoutInflater: LayoutInflater
        private var title: TextView? = null
        private var description: TextView? = null
        private var imageView: ImageView? = null

        init {
            layoutInflater = LayoutInflater.from(mContext)
        }


        override fun getCount(): Int {
            return titleArray.size
        }

        override fun getItem(position: Int): Any {
            return titleArray[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var convertView = convertView
            if (convertView == null) {
                convertView = layoutInflater.inflate(R.layout.main_activity_single_item, null)
            }

            title = convertView!!.findViewById<View>(R.id.tvMain) as TextView
            description = convertView.findViewById(R.id.tvDescription) as TextView
            imageView = convertView.findViewById<View>(R.id.ivMain) as ImageView

            title!!.text = titleArray[position]
            description!!.text = descriptionArray[position]

            if (titleArray[position].equals("Timetable", ignoreCase = true)) {
                imageView!!.setImageResource(R.drawable.timetable)
            } else if (titleArray[position].equals("Subjects", ignoreCase = true)) {
                imageView!!.setImageResource(R.drawable.book)
            } else if (titleArray[position].equals("Faculty", ignoreCase = true)) {
                imageView!!.setImageResource(R.drawable.contact)
            } else {
                imageView!!.setImageResource(R.drawable.settings)
            }

            return convertView

        }
    }

}
