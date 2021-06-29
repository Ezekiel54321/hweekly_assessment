package com.ezekiel.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Username: String = "Admin"
    var Password: String = "Admin"

    private lateinit var login: Button
    private lateinit var UsernameInput: EditText
    private lateinit var PasswordInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login = findViewById(R.id.loginButton)
        UsernameInput = findViewById(R.id.usernameET)
        PasswordInput = findViewById(R.id.PasswordET)

        login.setOnClickListener {
            var password = UsernameInput.text.toString()
            var username = PasswordInput.text.toString()
            val intent: Intent = Intent(this@MainActivity, MenuActivity2::class.java);
            startActivity(intent)

        }
        if (UsernameInput.text.toString().equals("Admin") && PasswordInput.text.toString()
                .equals("Admin")
        ) {
        } else {
            println("Username and Password is incorrect")
        }
    }
}



