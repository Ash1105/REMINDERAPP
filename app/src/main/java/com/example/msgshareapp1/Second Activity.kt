package com.example.msgshareapp1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")
        val msg2 = bundle!!.getString("user_message2")
        val msg3 = bundle!!.getString("user_message3")
        val msg4 = bundle!!.getString("user_message4")
        val msg5 = bundle!!.getString("user_message5")
        val msg6 = bundle!!.getString("user_message6")

        //Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        textView.text = "Patient Name: " + msg
        textView3.text = "Doctor's name : "+ msg2
        textView9.text = "Pill name : "+ msg3
        textView8.text = "No. of pills of " + msg3 + " to be taken everyday: "+ msg4
        textView10.text = "Pill name : "+ msg5
        textView11.text = "No. of pills of " + msg5 + " to be taken everyday: "+ msg6
    }
}