package com.example.myapp2

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var gameManager : GameManager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        gameManager = GameManager()
        changeQuestion()

        binding.op1.setOnClickListener {
            checkAnswer(gameManager.getQuestion().getOption1())
        }
        binding.op2.setOnClickListener {
            checkAnswer(gameManager.getQuestion().getOption2())
        }
        binding.op3.setOnClickListener {
            checkAnswer(gameManager.getQuestion().getOption3())
        }
        binding.op4.setOnClickListener {
            checkAnswer(gameManager.getQuestion().getOption4())
        }

    }

    fun changeQuestion(){
        binding.question.text = gameManager.getQuestion().getQuestion()
        binding.picture.setImageResource(gameManager.getCurrentImage())
        binding.op1.text = gameManager.getQuestion().getOption1()
        binding.op2.text = gameManager.getQuestion().getOption2()
        binding.op3.text = gameManager.getQuestion().getOption3()
        binding.op4.text = gameManager.getQuestion().getOption4()
    }

    fun checkAnswer(answer : String){
        if(!gameManager.checkAnswer(answer)) {
            if(gameManager.getLives() == 2)
                binding.life3.visibility = View.GONE
            if(gameManager.getLives() == 1)
                binding.life2.visibility = View.GONE
            if(gameManager.getLives() == 0)
                binding.life1.visibility = View.GONE
        }
        else
            binding.score.text = Integer.toString(gameManager.getScore())
        nextQuestion()

    }

    fun nextQuestion(){
        gameManager.moveToNextQuestion()
        if(gameManager.isGameOver()){
            Toast.makeText(this, "Game Over!" , Toast.LENGTH_LONG)
            return
        }
        binding.progress.setProgress(gameManager.getIndex())
        changeQuestion()
    }
}