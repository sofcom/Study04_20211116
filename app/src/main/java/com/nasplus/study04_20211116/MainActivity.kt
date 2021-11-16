package com.nasplus.study04_20211116

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLoginAction.setOnClickListener {
            val inputId = inputId.text.toString()
            val inputPass = inputPass.text.toString()

            if(inputId == "admin" && inputPass == "qwer"){
                Toast.makeText(this, "관리자님 반갑습니다!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "로그인을 실패했습니다!", Toast.LENGTH_SHORT).show()
            }
        }
    }


}