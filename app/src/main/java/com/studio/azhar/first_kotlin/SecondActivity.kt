package com.studio.azhar.first_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    private fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0

        if (count > 0){
            randomInt = random.nextInt(count+1)
        }
        findViewById<TextView>(R.id.textViewRandom).text = Integer.toString(randomInt)
        findViewById<TextView>(R.id.label).text = getString(R.string.text_secondActivity, count)
    }
}
