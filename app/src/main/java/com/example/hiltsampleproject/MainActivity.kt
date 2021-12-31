package com.example.hiltsampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @EnglishQualifier
    @Inject
    lateinit var englishPerson: Person

    @SpanishQualifier
    @Inject
    lateinit var spanishPerson: Person

    @Inject
    lateinit var gson: Gson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        englishPerson.speakLanguage()
        spanishPerson.speakLanguage()
        Log.i("MainActivityGson", gson.toString())
    }

}