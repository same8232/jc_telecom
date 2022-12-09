package com.example.jc_telecom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user_id = findViewById<EditText>(R.id.user1)
        val password = findViewById<EditText>(R.id.psw)
        val login = findViewById<Button>(R.id.login)


        login.setOnClickListener {
            val Intent = Intent(this, com.example.jc_telecom.home_screen::class.java)
            startActivity(Intent)
            finish()

            fun login() {

                val user1 = user_id
                val user_id = user1.text.toString()
                val psw = password
                val password = psw.text.toString()

                if (user_id.isEmpty()) {
                    Toast.makeText(this, "please enter user id", Toast.LENGTH_LONG).show()
                    return
                }
                if (password.isEmpty()) {
                    Toast.makeText(this, "please enter pasaword", Toast.LENGTH_LONG).show()
                    return
                } else {
                    Toast.makeText(this,
                        "userid: $user_id: password: $password",
                        Toast.LENGTH_LONG)
                        .show()
                }


            }

        }

    }
}