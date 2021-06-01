package com.example.examenrfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerMes = findViewById<Spinner>(R.id.spinnerMes)
        val valueMes =  listOf("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre")
        val arrayMes = ArrayAdapter(this,android.R.layout.simple_spinner_item,valueMes)
        spinnerMes.adapter = arrayMes
    }
    fun convertConcurrency(view: View){
        val nombreValue = txtNombre.text.toString()
        val apellidopValue = txtApellidop.text.toString()
        val apellidomValue = txtApellidom.text.toString()
    }

}