package com.example.meubiscoitodasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashiActivit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashi)

        //Abrir a MainActivity ap;oes 5 segundos
        Handler (Looper.getMainLooper()).postDelayed({
            //Iniciar uma Intrent - transição da tela Main
            val mIntent = Intent (this, MainActivity::class.java)
            startActivity(mIntent)
            finish ()
        }, 5000)
    }
}