package com.example.myconstraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when ( view!!.id)
        {
            R.id.button1->
            {
                myToast("20")
            }
            R.id.button2->
            {
                myToast("15")
            }
            R.id.button3->
            {
                myToast("10")
            }
            R.id.button4->
            {
                myToast("5")
            }
        }

    }
    private fun myToast(string: String)
    {
        val name = findViewById<TextView>(R.id.textView)
        val number:Int =  string.toInt()
        var i = 0
        while(i <number){
            name.text = i.toString()
            i++
            Thread.sleep(5000);
        }
    }
}