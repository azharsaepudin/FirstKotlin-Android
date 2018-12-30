package com.studio.azhar.first_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnTampil.setOnClickListener {
            Toast.makeText(this, "First kotlin", Toast.LENGTH_SHORT).show()
        }

        btnCounter.setOnClickListener {
            val showCountTextView = findViewById<TextView>(R.id.textViewAngka)
            val countString = showCountTextView.text.toString()

            var count: Int = Integer.parseInt(countString)
            count++

            showCountTextView.text = count.toString()
        }

        btnRandom.setOnClickListener {
            val randomIntent = Intent(this, SecondActivity::class.java)
            val countString = textViewAngka.text.toString()
            val count = Integer.parseInt(countString)
            randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
            startActivity(randomIntent)
        }
    }
}
