package ru.abyzbaev.moviefinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT
import ru.abyzbaev.moviefinderapp.R
import java.time.Duration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTestClass1 = MyDataClass();
        val myTestClass2 = MyDataClass("MyVal1", "MyVal2")

        val button: Button = findViewById(R.id.btn)
        val title: TextView = findViewById(R.id.title)
        val textView1: TextView = findViewById(R.id.t2)
        val textView2: TextView = findViewById(R.id.t3)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Toast.makeText(baseContext, "Toast!", LENGTH_SHORT).show()
            }
        })


    }
}

data class MyDataClass(val val1: String = "val1", val val2: String = "val2")