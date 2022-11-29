package com.diponkar.banglatoenglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.diponkar.banglatoenglishp.englishWordChangeToBanglaWord

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val t=("জয় বাংলা বাংলাদেশ").englishWordChangeToBanglaWord()

      println(t)

    }
}
