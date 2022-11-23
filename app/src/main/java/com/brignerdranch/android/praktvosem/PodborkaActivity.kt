package com.brignerdranch.android.praktvosem

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class PodborkaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.podborka)
    }


    fun vibor1(view: View) { val intent = Intent(this, bog::class.java)
        startActivity((intent))}
    fun vibor2(view: View) {val intent = Intent(this, BenzopActivity::class.java)
        startActivity((intent))}
    fun vibor3(view: View) {val intent = Intent(this, NaruActivity::class.java)
        startActivity((intent))}
    fun vibor4(view: View) {val intent = Intent(this, FamActivity::class.java)
        startActivity((intent))}
    fun vibor5(view: View) {val intent = Intent(this, KuklaActivity::class.java)
        startActivity((intent))}
    fun vibor6(view: View) {val intent = Intent(this, YariActivity::class.java)
        startActivity((intent))}

}