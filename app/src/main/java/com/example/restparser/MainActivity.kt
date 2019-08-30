package com.example.restparser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.AsyncTask
import com.example.restparser.pojo_model.TaskRest
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TaskRest().execute("https://api.tinkoff.ru/v1/news")
    }
}


