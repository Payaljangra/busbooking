package com.example.busbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val options= arrayOf("AM","PM")
        var v1=""
        if(spinner!=null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
            spinner.adapter = adapter
            spinner.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    v1 = options[p2]
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
        }


        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val options2 = arrayOf("1","2","3","4","5")
        var v2=""
        if(spinner2!=null) {
            val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, options2)
            spinner2.adapter = adapter2
            spinner2.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    v2 = options2[p2]
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    Toast.makeText(applicationContext,"Choose no of passengers",Toast.LENGTH_SHORT).show()

                }
            }
        }

        val spinner3 = findViewById<Spinner>(R.id.spinner3)
        val options3 = arrayOf("One-way","Two-way")
        var value =""
        if(spinner3 != null) {
            val adapter3 = ArrayAdapter(this, android.R.layout.simple_spinner_item, options3)
            spinner3.adapter = adapter3

            spinner3.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    value = options3[p2]
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }

        val view= findViewById<LinearLayout>(R.id.linearlayout)
        val name1 = findViewById<EditText>(R.id.firstname)
        val name2 = findViewById<EditText>(R.id.lastname)
        val phn = findViewById<EditText>(R.id.phone)
        val btn = findViewById<Button>(R.id.submit)
        val date = findViewById<EditText>(R.id.date)
        val time = findViewById<EditText>(R.id.time)

        btn.setOnClickListener{

                if(name1.text.toString().isEmpty() || name2.text.toString().isEmpty() || phn.text.toString().isEmpty()||date.text.toString().isEmpty() || time .text.toString().isEmpty())
                {

                    val snack = Snackbar.make(view,"Fill all the details",Snackbar.LENGTH_SHORT)
                    snack.setAction("UNDO"){

                    }
                   snack.show()
                }

                else {
                    val intent = Intent(this, MainActivity2::class.java)
                    intent.putExtra("Firstname", name1.text.toString())
                    intent.putExtra("Lastname", name2.text.toString())
                    intent.putExtra("Phonenumber", phn.text.toString())
                    intent.putExtra("JourneyType", value.toString())
                    intent.putExtra("Passengers",v2.toString())
                    intent.putExtra("Date",date.text.toString())
                    intent.putExtra("Time", time.text.toString())
                    intent.putExtra("Duration",v1.toString())
                    startActivity(intent)

                }

            }





    }
}