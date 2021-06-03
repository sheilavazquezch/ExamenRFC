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

        val spinnerDia = findViewById<Spinner>(R.id.spinnerDia)
        val valueDia =  listOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31")
        val arrayDia = ArrayAdapter(this,android.R.layout.simple_spinner_item,valueDia)
        spinnerDia.adapter = arrayDia

        val spinnerYear = findViewById<Spinner>(R.id.spinnerYear)
        for (i in 1950 until 2020){
            spinnerYear.add(i.toString())
        }
        val arrayYear = ArrayAdapter(this,android.R.layout.simple_spinner_item,spinnerYear)
        spinnerYear.adapter = arrayYear

        fun convertConcurrency(view: View){
            val nombreValue = txtNombre.text.toString()
            print(nombreValue)
            val apellidopValue = txtApellidop.text.toString()
            val apellidomValue = txtApellidom.text.toString()
            val diaValue = spinnerDia.selectedItem.toString()
            val mesValue = spinnerMes.selectedItem.toString()
            val yearValue = spinnerYear.selectedItem.toString()

            val rfc = nombreValue + apellidopValue + apellidomValue + diaValue + mesValue + yearValue
            print(rfc)
        }
    }
}