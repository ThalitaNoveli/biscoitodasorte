package com.example.meubiscoitodasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import kotlinx.android.synthetic.main.activity_main.*
import  kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNUSED_LAMBDA_EXPRESSION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Escutar o click do botão gerar sorte
      //  val btnIniciar: Button = findViewById(R.id.btnInicial)
        //val edtTextResultado: TextView = findViewById(R.id.edtTextResultado)
        //val edtTextResultado: TextView = findViewById(R.id.edtTextResultado)

        // definin do uma lista - gerar frase
        val frases= arrayListOf("A vida trará coisas boas se tiveres paciência", "Não dispense na ira o que lhe falta na razão", "ão importa o tamanho da montanha, ele não tapara o sol")
        btnInicial.setOnClickListener {
            edtTextResultado.setText(frases.random())
        }
        //Obtendo um elemento aleatório



    }
}



