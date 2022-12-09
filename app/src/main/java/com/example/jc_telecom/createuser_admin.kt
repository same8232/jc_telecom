package com.example.jc_telecom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class createuser_admin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createuser_admin)


        val save = findViewById<Button>(R.id.save1)
        save.setOnClickListener {
            val Intent = Intent(this, vendors_details::class.java)
            startActivity(Intent)
        }
    }
}