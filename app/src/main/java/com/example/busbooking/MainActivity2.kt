package com.example.busbooking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name1 = findViewById<TextView>(R.id.fname)
        val name2 = findViewById<TextView>(R.id.lname)
        val phone = findViewById<TextView>(R.id.pnumber)
        val journey = findViewById<TextView>(R.id.type)
        val passenger = findViewById<TextView>(R.id.passengers)
        val t = findViewById<TextView>(R.id.time)
        val d = findViewById<TextView>(R.id.date)
        val  btn = findViewById<Button>(R.id.ok)
//        val dur = findViewById<TextView>(R.id.duration)

        val first = intent.getStringExtra("Firstname")
        val last = intent.getStringExtra("Lastname")
        val number = intent.getStringExtra("Phonenumber")
        val pass = intent.getStringExtra("Passengers")
        val jType = intent.getStringExtra("JourneyType")
        val T = intent.getStringExtra("Time")
        val D = intent.getStringExtra("Date")
        val Dura = intent.getStringExtra("Duration")
        name1.text = "Firstname : $first"
        name2.text = "Lastname : $last"
        phone.text = "Phonenumber : $number"
        passenger.text="No of Passengers : $pass"
        journey.text = "JourneyType : $jType"
        d.text = "Date : $D "
        t.text = "Time : $T" + "$Dura"

        btn.setOnClickListener(object: View.OnClickListener
        {
            override fun onClick(p0: View?) {
                finish()
            }
        })



    }
}