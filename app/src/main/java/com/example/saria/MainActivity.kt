package com.example.saria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btndignup.setOnClickListener {
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
        btndlogin.setOnClickListener {
            val intent = Intent(this,LOGIN::class.java)
            startActivity(intent)
        }
    }
}