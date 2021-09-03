package com.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var a: Int = 1
    var b: Int = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c: Int = a + b
        print("$c")
        print("Hello world")
        print("Kabir Agamirzaev")
    }
}