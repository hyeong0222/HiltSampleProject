package com.example.hiltsampleproject

import android.util.Log
import javax.inject.Inject

class EnglishPerson @Inject constructor() : Person {
//    fun speakEnglish() {
//        Log.i("EnglishPerson", "Hello kind sir.")
//    }

    override fun speakLanguage() {
        Log.i("EnglishPerson", "Hello kind sir.")
    }
}