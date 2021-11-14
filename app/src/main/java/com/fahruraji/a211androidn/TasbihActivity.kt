package com.fahruraji.a211androidn

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class TasbihActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbih)

        val mediaPlayer = MediaPlayer.create(this, R.raw.tone1)

        val targetEditText = findViewById<EditText>(R.id.targetEditText)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val counterButton = findViewById<Button>(R.id.counterButton)
        val countTextView = findViewById<TextView>(R.id.countTextView)

        counterButton.setOnClickListener {
            val target = targetEditText.text.toString()
            var counts = countTextView.text.toString().trim().toInt()
            counts ++
            countTextView.setText(counts.toString())

            if (target != "" && counts == target.trim().toInt()) {
                mediaPlayer?.start()
                Toast.makeText(this,"Alhamdulillah, target bacaan Anda sebanyak $target kali sudah tercapai.",Toast.LENGTH_SHORT).show()
            }

        }

        resetButton.setOnClickListener {
            countTextView.setText("0")
            targetEditText.setText("")
        }
    }
}