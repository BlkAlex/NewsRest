package com.example.restparser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import android.os.AsyncTask
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


