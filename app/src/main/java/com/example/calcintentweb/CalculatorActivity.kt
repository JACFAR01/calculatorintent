package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Btn_add.setOnClickListener {
            var fnum=edit_fnum.text.toString()
            var snum=Edit_snum.text.toString()

            if (fnum.isEmpty()or snum.isEmpty()){
                Text_answer.text="please fill in the details"
            }else{
                var answer=fnum.toDouble()+snum.toDouble()
                Text_answer.text=answer.toString()
            }
        }
        Btn_subtract.setOnClickListener {
            var fnum=edit_fnum.text.toString()
            var snum=Edit_snum.text.toString()

            if (fnum.isEmpty()or snum.isEmpty()){
                Text_answer.text="please fill in the details"
            }else{
                var answer=fnum.toDouble()-snum.toDouble()
                Text_answer.text=answer.toString()

            }
        }
        Btn_divide.setOnClickListener {
            var fnum=edit_fnum.text.toString()
            var snum=Edit_snum.text.toString()

            if (fnum.isEmpty()or snum.isEmpty()){
                Text_answer.text="please fill in the details"
            }else{
                var answer=fnum.toDouble()/snum.toDouble()
                Text_answer.text=answer.toString()

            }
        }
        Btn_multiply.setOnClickListener {
            var fnum=edit_fnum.text.toString()
            var snum=Edit_snum.text.toString()

            if (fnum.isEmpty()or snum.isEmpty()){
                Text_answer.text="please fill in the details"
            }else{
                var answer=fnum.toDouble()*snum.toDouble()
                Text_answer.text=answer.toString()

            }
        }

    }
}
