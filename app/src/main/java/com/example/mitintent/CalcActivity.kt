package com.example.mitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc.*

class CalcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
        btnAddition.setOnClickListener {
            var FirstNumber=num.text.toString()
            var SecondNumber=num2.text.toString()
            if (FirstNumber.isEmpty()or SecondNumber.isEmpty()){
                Answer.text="please key in details"}else {
                var Ans= FirstNumber.toDouble() + SecondNumber.toDouble()
                Answer.text=Ans.toString()
            }
        }
        btnsubtruction.setOnClickListener {
            var FirstNumber=num.text.toString()
            var SecondNumber=num2.text.toString()
            if (FirstNumber.isEmpty()or SecondNumber.isEmpty()){
                Answer.text="please key in details"}else {
                var Ans= FirstNumber.toDouble() - SecondNumber.toDouble()
                Answer.text=Ans.toString()
            }
        }
        btndivision.setOnClickListener {
            var FirstNumber=num.text.toString()
            var SecondNumber=num2.text.toString()
            if (FirstNumber.isEmpty()or SecondNumber.isEmpty()){
                Answer.text="please key in details"}else {
                var Ans= FirstNumber.toDouble() / SecondNumber.toDouble()
                Answer.text=Ans.toString()
            }
        }
        btnMultiplication.setOnClickListener {
            var FirstNumber=num.text.toString()
            var SecondNumber=num2.text.toString()
            if (FirstNumber.isEmpty()or SecondNumber.isEmpty()){
                Answer.text="please key in details"}else {
                var Ans= FirstNumber.toDouble() * SecondNumber.toDouble()
                Answer.text=Ans.toString()
            }
        }
    }
}