package com.brignerdranch.android.praktvosem

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class bog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bog)
    }
    fun end(view: View) {
        val intent = Intent(this, PodborkaActivity::class.java)
        startActivity((intent))

    }
}