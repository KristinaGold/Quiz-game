package com.example.myapp2

class GameManager {

    private lateinit var questionList: List<Question>
    private var index : Int = 0
    private var score : Int = 0

    private var lives : Int = 3

    init {
        questionList = generateQuestions()
    }
    fun getScore(): Int {
        return score
    }
    fun getLives(): Int{
        return lives
    }
    fun getIndex(): Int {
        return index
    }
    fun getListSize(): Int {
        return questionList.size
    }
    fun getCurrentImage(): Int {
        return questionList[index].getImage()
    }
    fun getQuestion(): Question{
        return questionList[index]
    }
    fun checkAnswer(answer: String): Boolean{
        if (answer.equals(questionList[index].getCorrectOption()))
        {
            score ++
            return true}
        else{
            lives --
            return false}
    }
    fun moveToNextQuestion() {

        index++
    }
    fun isGameOver(): Boolean {
        return (index >= questionList.size) || (lives == 0)
    }
    fun generateQuestions(): List<Question>{
        val questionList = ArrayList<Question>()

        questionList.add(QuestionGenerator().question1())
        questionList.add(QuestionGenerator().question2())
        questionList.add(QuestionGenerator().question3())
        questionList.add(QuestionGenerator().question4())
        questionList.add(QuestionGenerator().question5())
        questionList.add(QuestionGenerator().question6())

        return questionList
    }
}