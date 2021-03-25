package com.example.msgshareapp1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        mybutton.setOnClickListener{
            val message: String = editTextTextPersonName.text.toString()
            val message2: String = textView2.text.toString()
            val message3: String = textView4.text.toString()
            val message4: String = textView5.text.toString()
            val message5: String = textView6.text.toString()
            val message6: String = textView7.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message",message)
            intent.putExtra("user_message2",message2)
            intent.putExtra("user_message3",message3)
            intent.putExtra("user_message4",message4)
            intent.putExtra("user_message5",message5)
            intent.putExtra("user_message6",message6)
            startActivity(intent)
        }
        button211.setOnClickListener(){
            val message: String ="I am not feeling well and am in a emergency. Please come to look on me as soon as possible."

            val intent = Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent,"Share to : "))
        }
        recyclerview.setOnClickListener(){
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}

