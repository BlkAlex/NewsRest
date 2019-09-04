package com.example.restparser

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.AsyncTask
import androidx.recyclerview.widget.LinearLayoutManager
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import androidx.recyclerview.widget.RecyclerView
import com.example.restparser.test1.Payload
import java.io.BufferedReader
import java.io.IOException
import java.net.MalformedURLException
import java.net.ProtocolException
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.LinkedHashMap


class MainActivity : AppCompatActivity() {
    open lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        //recyclerView.addItemDecoration( ItemDecor);
        val layoutManager = LinearLayoutManager(this)
        recyclerView.setLayoutManager(layoutManager)


        TaskRest(this).execute("https://api.tinkoff.ru/v1/news")
    }

    class TaskRest(context2 :Context) : AsyncTask<String, Int, String>() {
        val context = context2
        override fun doInBackground(vararg urls: String): String {
            var url: URL? = null
            try {
                url = URL(urls[0])
            } catch (e: MalformedURLException) {
                e.printStackTrace()
            }

            var connection: HttpURLConnection? = null
            try {
                connection = url!!.openConnection() as HttpURLConnection
            } catch (e: IOException) {
                e.printStackTrace()
            }

            try {
                connection!!.requestMethod = "GET"
            } catch (e: ProtocolException) {
                e.printStackTrace()
            }

            connection!!.doOutput = true
            connection.connectTimeout = 5000
            connection.readTimeout = 5000
            try {
                connection.connect()
            } catch (e: IOException) {
                e.printStackTrace()
            }

            var rd: BufferedReader? = null
            try {
                rd = BufferedReader(InputStreamReader(connection.inputStream))
            } catch (e: IOException) {
                e.printStackTrace()
            }

            var content = ""
            var line: String? = null
            while (true) {
                try {
                    line = rd?.readLine()
                    if (line == null)
                        break
                } catch (e: IOException) {
                    e.printStackTrace()
                    break
                }

                content += line!! + "\n"
            }
            return content
        }


        override fun onPostExecute(result: String) {
            // this is executed on the main thread after the process is over
            // update your UI here
            var p = Payload()


            try {
                p = JsonParser.getResponseStep(result, Payload::class.java)
            } catch (e: IOException) {
                e.printStackTrace()
            }

            p.payload.sortWith(compareBy {it.publicationDate.milliseconds})
            p.payload.reverse()

            //var f = p.additionalProperties.get("payload") as ArrayList<LinkedHashMap<String,String>>
          //  val sortedList = f.sortedWith(compareBy({ (it.get("publicationDate").get("milliseconds")).toLong() }))

             (context as MainActivity).recyclerView?.adapter = RecyclerViewAdapter(context,p.payload)
//
//                    (p.additionalProperties.get("payload") as ArrayList <HashMap<String,ArrayList<LinkedHashMap<>>>> ) ArrayList<HashMap<String,Object>>)


        }
    }
}
