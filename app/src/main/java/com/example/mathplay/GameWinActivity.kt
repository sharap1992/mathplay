package com.example.mathplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_win.*

class GameWinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_win)
       intent.getIntExtra("win", 0)
        tVWin.text = "Qutlıqlaymız, siz — jen'impazsız!!!"

    }
}