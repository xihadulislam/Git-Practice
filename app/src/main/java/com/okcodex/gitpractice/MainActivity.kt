package com.okcodex.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainmaster("main master")
        xihad("xihad")


        testprogram()

    }



    fun mainmaster(str : String){
        Log.d("main",str)

    }

    fun xihad(str : String){
        Log.d("main",str)

    }



    fun testprogram (){

        // nothing to do


    }

}
