package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println ("Введите число и выберите валюту")
        var button2: TextView = findViewById(R.id.button2)
        var button7: TextView = findViewById(R.id.button7)
        var button8: TextView = findViewById(R.id.button8)
        var button9: TextView = findViewById(R.id.button9)
        var button10: TextView = findViewById(R.id.button10)
        var button11: TextView = findViewById(R.id.button11)
        var button12: TextView = findViewById(R.id.button12)
        var button13: TextView = findViewById(R.id.button13)
        var rub: TextView = findViewById(R.id.autoCompleteTextView8)
        var usd: TextView = findViewById(R.id.autoCompleteTextView2)
        var eur: TextView = findViewById(R.id.autoCompleteTextView3)
        var yen: TextView = findViewById(R.id.autoCompleteTextView4)
        var q: String
        q = ""
        editTextTextPersonName3.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                q = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }


        })
        button2.setOnClickListener{
            var w : Float
            try {
                w = q.toFloat()
                rub.setText("$q")
                w = w / 74
                usd.setText("$w")
                w = w * 100
                yen.setText("$w")
                w = q.toFloat()
                w = w / 82
                eur.setText("$w")
            }
            catch (e: Exception) {
                rub.setText("Проверьте данные")
                usd.setText("Проверьте данные")
                yen.setText("Проверьте данные")
                eur.setText("Проверьте данные")
            }

        }
        button7.setOnClickListener{
            try {
                usd.setText("$q")
                var w : Float
                w = q.toFloat()
                w = w * 100
                yen.setText("$w")
                w = w / 100 * 74
                rub.setText("$w")
                w = w / 82
                eur.setText("$w")
            }
            catch (e: Exception) {
                rub.setText("Проверьте данные")
                usd.setText("Проверьте данные")
                yen.setText("Проверьте данные")
                eur.setText("Проверьте данные")
            }
        }
        button8.setOnClickListener{
            try {
                eur.setText("$q")
                var w : Float
                w = q.toFloat()
                w = w * 82
                rub.setText("$w")
                w = w / 74
                usd.setText("$w")
                w = w * 100
                yen.setText("$w")
            }
            catch (e: Exception) {
                rub.setText("Проверьте данные")
                usd.setText("Проверьте данные")
                yen.setText("Проверьте данные")
                eur.setText("Проверьте данные")
            }
        }
        button9.setOnClickListener{
            try {
                yen.setText("$q")
                var w : Float
                w = q.toFloat()
                w = w / 100
                usd.setText("$w")
                w = w * 74
                rub.setText("$w")
                w = w / 82
                eur.setText("$w")
            }
            catch (e: Exception) {
                rub.setText("Проверьте данные")
                usd.setText("Проверьте данные")
                yen.setText("Проверьте данные")
                eur.setText("Проверьте данные")
            }
        }
    }
}
