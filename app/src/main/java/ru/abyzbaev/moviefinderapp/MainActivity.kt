package ru.abyzbaev.moviefinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT
import ru.abyzbaev.moviefinderapp.R
import java.time.Duration
import java.util.concurrent.TimeUnit

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

        val textView5: TextView = findViewById(R.id.cycle_test)




        textView1.setText(myTestClass1.val1)
        textView2.setText(myTestClass1.val2)


        MyTestObject.testVar = myTestClass1;

        val textView3: TextView = findViewById(R.id.t4)
        val textView4: TextView = findViewById(R.id.t5)
        textView3.setText(MyTestObject.testVar.val1)
        textView4.setText(MyTestObject.testVar.val2)


        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Toast.makeText(baseContext, "Toast!", LENGTH_SHORT).show()
                for (i in 0..10){
                    textView5.setText(textView5.text.toString() + " " + i.toString())
                }
            }
        })

        for (i in 10 downTo 0 step 2){
            //println(i)
            Log.d("###", i.toString())
        }

        val cycle2: List<Int> = listOf(1, 2, 3, 4, 5)
        for(i in 0 until cycle2.size){
            Log.d("###_###", i.toString())
        }



    }
}

data class MyDataClass(val val1: String = "val1", val val2: String = "val2")

object MyTestObject{
    lateinit var testVar: MyDataClass


}