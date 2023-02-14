package com.example.saria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

//    private lateinit var editTextTextPersonName: EditText
//    private  lateinit var editTextTextPassword: EditText
//    private  lateinit var signupbtn :EditText
      private  lateinit var  db : DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

//        uname = findViewById(R.id.editTextTextPersonName)
//        pword = findViewById(R.id.editTextTextPassword)
//        signupbtn = findViewById(R.id.button3)
        db = DBHelper(this)

        button3.setOnClickListener {
            val unametext = editTextTextPersonName.text.toString()
            val pwordtext = editTextTextPassword.text.toString()
            val savedata = db.insertdata(unametext,pwordtext)

            if(TextUtils.isEmpty(unametext) || TextUtils.isEmpty(pwordtext)){
                Toast.makeText(this, "add username Password ", Toast.LENGTH_SHORT).show()
                val intent = Intent(applicationContext,LOGIN::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "pass", Toast.LENGTH_SHORT).show()
                val intent = Intent(applicationContext,LOGIN::class.java)
                startActivity(intent)
            }
        }


    }
}