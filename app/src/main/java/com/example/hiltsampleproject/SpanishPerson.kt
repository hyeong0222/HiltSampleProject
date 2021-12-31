package com.example.hiltsampleproject

import android.util.Log
import javax.inject.Inject

class SpanishPerson @Inject constructor() : Person {
//    fun speakSpanish() {
//        Log.i("SpanishPerson", "Despacito senor")
//    }

    override fun speakLanguage() {
        Log.i("SpanishPerson", "Despacito senor")
    }
}