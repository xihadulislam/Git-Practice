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

        var test = "3432423423"
        var test1 = "3432423423"
        var test2 = "3432423423"
        var test3 = "3432423423"

    }



    fun mainmaster(str : String){
        Log.d("main",str)

    }

    fun xihad(str : String){
        Log.d("main",str)

    }

    /// comments

}
