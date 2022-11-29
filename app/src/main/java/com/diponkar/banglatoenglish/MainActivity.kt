package com.diponkar.banglatoenglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.diponkar.banglatoenglishp.englishWordChangeToBanglaWord

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      var t=(
        "Coming dফঘব্বহ  নফজ্জ বন গ্যতু৬তজ was screened at the programme.").englishWordChangeToBanglaWord()

      Toast.makeText(this, ""+t, Toast.LENGTH_SHORT).show()




    }
}
