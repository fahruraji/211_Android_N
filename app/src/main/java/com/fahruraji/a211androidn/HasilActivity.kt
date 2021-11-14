package com.fahruraji.a211androidn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val phoneTextView = findViewById<TextView>(R.id.phoneTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val tanggalTextView = findViewById<TextView>(R.id.tanggalTextView)
        val nomorTextView = findViewById<TextView>(R.id.nomorTextView)

        namaTextView.setText(intent.getStringExtra("nama_extra"))
        emailTextView.setText(intent.getStringExtra("email_extra"))
        phoneTextView.setText(intent.getStringExtra("phone_extra"))
        tanggalTextView.setText(intent.getStringExtra("tanggal_extra"))
        nomorTextView.setText(intent.getStringExtra("nomor_extra"))
    }
}