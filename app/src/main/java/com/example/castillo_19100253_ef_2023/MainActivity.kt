package com.example.castillo_19100253_ef_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val db = FirebaseFirestore.getInstance()
        val txtPrecio: TextView = findViewById(R.id.txtPrecio)
        val txtDescripcion: TextView = findViewById(R.id.txtDesc)
        val txtID: TextView = findViewById(R.id.txtID)
        val txtCantidad: TextView = findViewById(R.id.txtCantidad)
    }
}