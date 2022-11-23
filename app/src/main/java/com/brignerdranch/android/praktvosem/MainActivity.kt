package com.brignerdranch.android.praktvosem

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var email:EditText
    lateinit var pass: EditText
    lateinit var button: Button
    lateinit var settings: SharedPreferences
    public final var APP_PREFERENCES = "mysettings"
    var hasVisited:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE)
        // get and check login
        val passs : String = settings.getString("password", "") ?: ""
        val emaill : String = settings.getString("email", "") ?: ""
        hasVisited = emaill.isNotEmpty()

        email = findViewById((R.id.email))
        pass = findViewById((R.id.password))

        if(hasVisited)
        {
            pass.setText(passs)
            email.setText(emaill)
        }


    }


    fun NextButton(view: View) {
        val hasPassword = pass.text.toString().isNotEmpty()
        val hasEmail = email.text.toString().isNotEmpty()

        when {
            !hasPassword ||!hasEmail ->
            AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Незаполнены поля!!!")
                .setPositiveButton("Ок",null)
                .create()
                .show()
            !hasVisited -> {

                val password = pass.getText().toString()
                val email = email.getText().toString()
                val prefEditor = settings.edit()
                prefEditor.putString("password", password)
                prefEditor.putString("email", email)
                prefEditor.apply()
                val intent = Intent(this, MainActivity2::class.java)
                startActivity((intent))
            }
            else -> {
                var code = pass.getText().toString();
                var getpas = settings.getString("password","nopas")
                if (code == getpas)
                {
                    val intent = Intent(this, MainActivity2::class.java)
                    startActivity((intent))
                }
                else {
                    AlertDialog.Builder(this)
                        .setTitle("Ошибка")
                        .setMessage("Неверный пароль!")
                        .setPositiveButton("Ок",null)
                        .create()
                        .show()
                }

            }
        }
    }
    fun clear(view: View) {
        val e: SharedPreferences.Editor = settings.edit()
        e.clear()
        e.apply()
    }

}


