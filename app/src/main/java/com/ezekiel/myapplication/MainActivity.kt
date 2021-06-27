package com.ezekiel.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

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

        login.setOnClickListener{
            val Username = UsernameInput.text.toString()
            val Password = PasswordInput.text.toString()
            if(Username.text.toString().equals()("Admin") && Password=="Admin"){
               val intent: Intent = Intent( this, MenuActivity2::class.java)
                }
            else{
                println("Username and Password is incorrect")
            }

        }
    }
}