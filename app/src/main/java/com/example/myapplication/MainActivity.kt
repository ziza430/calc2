package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.math_operation




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_0.setOnCkickListener {setTextFields("0")}
        btn_1.setOnCkickListener {setTextFields("1")}
        btn_2.setOnCkickListener {setTextFields("2")}
        btn_3.setOnCkickListener {setTextFields("3")}
        btn_4.setOnCkickListener {setTextFields("4")}
        btn_5.setOnCkickListener {setTextFields("5")}
        btn_6.setOnCkickListener {setTextFields("6")}
        btn_7.setOnCkickListener {setTextFields("7")}
        btn_8.setOnCkickListener {setTextFields("8")}
        btn_9.setOnCkickListener {setTextFields("9")}
        minus_btn.setOnClickListener {setTextFields("-")}
        plus_btn.setOnClickListener {setTextFields("+")}
        mult_btn.setOnClickListener {setTextFields("*")}
        division.setOnClickListener {setTextFields("/")}
        bracel.setOnClickListener {setTextFields("(")}
        bracer.setOnClickListener {setTextFields(")")}

        clear_btn.setOnClickListener {
            math_operation.text = ""
            result_text.text = ""
        }
        back_btn.setOnClickListener{
            val str = math_operation.text.toString()
            if(str.isNotEmpty()){
                math_operation.text = str.substring(0, str.length - 1)
            }
            result_text.text = ""
        }
    }

    fun setTextFields(str: String) {
        math_operation.append(str) //добавление к уже существующей строке новую строку, добавляем символ который получаем в этой функции
    }

}


//android:gravity="end" весь текст прижат к концу
//android:ellipsize="start" весь текст, непомещающийся в строку будет обрезаться
//android:id="@+id/result_text" выводится результат
//android:ellipsize="start" старый текст скрываться, новый показываться
//android:ellipsize="end" новый текст скрываться, старый показываться
//android:singleLine="true" текст будет помещается в 1 строку