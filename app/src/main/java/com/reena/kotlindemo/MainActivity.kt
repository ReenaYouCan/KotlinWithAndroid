package com.reena.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

//Error that we may face Unresolved reference: kotlinx
//Resolution :http://stackoverflow.com/questions/34169562/unresolved-reference-kotlinx
class MainActivity : AppCompatActivity() {

    // No more annotations nor semicolons
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.tvHelloKotlin.setText("Hello Kotlin")
        firstKFun()
    }

    /**
     * Click Listener
     */
    fun firstKFun() {
        tvHelloKotlin.setOnClickListener(View.OnClickListener { Toast.makeText(this,"Hello Kotlin",Toast.LENGTH_SHORT).show() })
    }
}
