package com.fahruraji.a211androidn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)
        val logoutButton = findViewById<Button>(R.id.logoutButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val tanggalEditText = findViewById<EditText>(R.id.tanggalEditText)
        val nomorEditText = findViewById<EditText>(R.id.nomorEditText)


        simpanButton.setOnClickListener {
            val nama = namaEditText.text.toString()
            val phone = phoneEditText.text.toString()
            val email = emailEditText.text.toString()
            val tanggal = tanggalEditText.text.toString()
            val nomor = nomorEditText.text.toString()
            Toast.makeText(this,"Hai $nama",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,HasilActivity::class.java)
            intent.putExtra("nama_extra",nama)
            intent.putExtra("phone_extra",phone)
            intent.putExtra("email_extra",email)
            intent.putExtra("tanggal_extra",tanggal)
            intent.putExtra("nomor_extra",nomor)
            startActivity(intent)
        }

        batalButton.setOnClickListener {
            var angka = nomorEditText.text.toString().trim().toInt()
            angka ++
            nomorEditText.setText(angka.toString())
        }

        logoutButton.setOnClickListener {
            val sharedPref = this.getSharedPreferences("MY_SHARED_PREFERENCES",MODE_PRIVATE)
            with(sharedPref.edit()) {
                putString("username", "")
                putString("password", "")
                apply()
            }

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}