package com.example.castillo_19100253_ef_2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val auth = FirebaseAuth.getInstance()
        val db = FirebaseFirestore.getInstance()

        val btnLogin: Button = findViewById(R.id.btnLogin)
        val txtCorreo: EditText = findViewById(R.id.txtUsuario)
        val txtClave: EditText = findViewById(R.id.txtClave)

        btnLogin.setOnClickListener {
            val correo = txtCorreo.text.toString()
            val clave = txtClave.text.toString()

            auth.signInWithEmailAndPassword(correo,clave)
                .addOnCompleteListener(this){task->
                    if(task.isSuccessful){
                        Snackbar
                            .make(
                                findViewById(android.R.id.content)
                                ,"Inicio de sesión exitoso"
                                , Snackbar.LENGTH_LONG
                            ).show()
                        startActivity(Intent(this, MainActivity::class.java))
                    }else {
                        Snackbar
                            .make(
                                findViewById(android.R.id.content)
                                ,"Credenciales inválidas"
                                , Snackbar.LENGTH_LONG
                            ).show()
                    }
                }
        }
    }
}
