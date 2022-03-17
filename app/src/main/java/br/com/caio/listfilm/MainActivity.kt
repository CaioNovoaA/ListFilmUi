package br.com.caio.listfilm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     val btnlogin:Button = findViewById(R.id.btLogin)
        btnlogin.setOnClickListener {
            val tLogin: TextInputLayout = findViewById(R.id.tlogin)
            val tSenha: TextInputLayout = findViewById(R.id.tSenha)
            val login: String = tLogin.toString()
            val senha: String = tSenha.toString()
            if (login == "Caio" && senha == "123") {
                alert("Login realizado com sucesso")
            } else {
                alert("Login ou senha incorretos ")
            }
        }
    }
    private fun alert(s: String) {
        Toast.makeText(applicationContext,s,Toast.LENGTH_LONG).show()
    }

}