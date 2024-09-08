package br.com.gustavo.diario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityDiario: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diary)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnDiary = findViewById<Button>(R.id.btnDiary)
        btnDiary.setOnClickListener {
            val intent = Intent(this, ActivityDiario::class.java)
            startActivity(intent)
        }

        val btnEquipe = findViewById<Button>(R.id.btnEquipe)
        btnEquipe.setOnClickListener {
            val intent = Intent(this, ActivityEquipe::class.java)
            startActivity(intent)
        }

    }
}