package com.example.mathplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var tj = intent.getIntExtra("tuwriJuwap", 0)
        var qt = intent.getIntExtra("qateJuwap", 0)
        tvResult.text = "Tuwri juwaplar sani: $tj \nQate juwaplar sani: $qt"

    }
}