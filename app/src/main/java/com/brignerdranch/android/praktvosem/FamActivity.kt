package com.brignerdranch.android.praktvosem

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class FamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fam)
    }
    fun end(view: View) {
        val intent = Intent(this, PodborkaActivity::class.java)
        startActivity((intent))

    }
}