package com.example.mathplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var firstNumber:Int = 0
    private var secondNumber:Int = 0
    private var tuwriJuwap:Int = 0
    private var qateJuwap:Int = 0
    private var operator: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playGame()
 }

    fun variantClick(button: View) {
        val intent = Intent(this, SecondActivity::class.java)
        if ((button as Button).text == getRightAnswer().toString()) {
            tuwriJuwap++
            playGame()
        } else {
            qateJuwap++
            playGame()
        }
        if((qateJuwap + tuwriJuwap) == 10){
            intent.putExtra("qateJuwap", qateJuwap)
            intent.putExtra("tuwriJuwap", tuwriJuwap)
            startActivity(intent)
        }
    }


    private fun playGame() {
        firstNumber = generateRandomNumber(10, 20)
        secondNumber = generateRandomNumber(2, 20)
        operator = generateRandomOperator()
        number1.text = firstNumber.toString()
        number2.text = secondNumber.toString()
        tvOperator.text = operator
        generateWrongAnAnswer()
        setRightAnswer()
    }

   private fun generateRandomNumber(start: Int, end: Int): Int = Random.nextInt(start, end)


private fun generateRandomOperator(): String {
    return when (generateRandomNumber(0, 4)) {
        0 -> "+"
        1 -> "-"
        2 -> "*"
        3 -> "/"
        else -> "+"
    }
}
private fun generateWrongAnAnswer() {
        val answer = getRightAnswer()
    val variantA = when(generateRandomNumber(0, 2)) {
        0 -> answer - generateRandomNumber(3, 100)
        1 -> answer + generateRandomNumber(3, 100)
       else -> answer + generateRandomNumber(3, 100)
     }
    val variantB = when(generateRandomNumber(0, 2)) {
        0 -> answer - generateRandomNumber(3, 100)
        1 -> answer + generateRandomNumber(3, 100)
        else -> answer + generateRandomNumber(3, 100)
    }
    val variantC = when(generateRandomNumber(0, 2)) {
        0 -> answer - generateRandomNumber(3, 100)
        1 -> answer + generateRandomNumber(3, 100)
        else -> answer + generateRandomNumber(3, 100)
    }
    val variantD = when(generateRandomNumber(0, 2)) {
        0 -> answer - generateRandomNumber(3, 100)
        1 -> answer + generateRandomNumber(3, 100)
        else -> answer + generateRandomNumber(3, 100)
    }
    btnA.text = variantA.toString()
    btnB.text = variantB.toString()
    btnC.text = variantC.toString()
    btnD.text = variantD.toString()
    }

    private fun getRightAnswer(): Int {
        return when(operator) {
            "+" -> firstNumber + secondNumber
            "-" -> firstNumber - secondNumber
            "*" -> firstNumber * secondNumber
            "/" -> firstNumber / secondNumber
            else -> firstNumber + secondNumber
        }
    }

    private fun setRightAnswer() {
       val answer = getRightAnswer()
        when(generateRandomNumber(0, 4)) {
          0 -> btnA.text = answer.toString()
          1 -> btnB.text = answer.toString()
          2 -> btnC.text = answer.toString()
          3 -> btnD.text = answer.toString()
            else -> btnA.text = answer.toString()
        }
    }
}
