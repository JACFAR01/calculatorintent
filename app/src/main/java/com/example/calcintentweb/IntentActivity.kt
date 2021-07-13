package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

       Btn_sms.setOnClickListener {
           sendSMS("0714468111","hellow how are you")

       }
        Btn_stk.setOnClickListener {
            val simToolKitLauncherIntent=this@IntentActivity.getPackageManager().getLaunchIntentForPackage("com.android.stk");
            if (simToolKitLauncherIntent  !=null){
                startActivity(simToolKitLauncherIntent)

            }            }
        Btn_Email.setOnClickListener {
            email("jaffarabdi020@gmail.com","exams update","get ready")
            Btn_share.setOnClickListener {
                share("kindly vissit my facebook page")
            }
            Btn_call.setOnClickListener {
                makeCall("0714468111")
            }
            Btn_browser.setOnClickListener {
                browse("https://www.marca.com/en/football/uefa-euro/2021/07/07/60e4cf8f268e3eee7b8b467d.html"
                        )
            }

        }





        }
    }
