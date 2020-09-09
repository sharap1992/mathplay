package com.example.mathplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_win.*
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var tj = intent.getIntExtra("tuwriJuwap", 0)

        tvResult.text = "Tuwrı juwaplar sanı: $tj \nSiz utıldin'ız"
    }
}