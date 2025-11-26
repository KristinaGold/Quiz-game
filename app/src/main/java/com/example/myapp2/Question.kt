package com.example.myapp2

class Question {

    private var question: String

    private var image: Int

    private var options: Array<String>

    private var correct: String

    constructor(question: String, image: Int, options: Array<String>, correct: String) {
        this.question = question
        this.image = image
        this.options = options
        this.correct = correct
    }

    fun getQuestion() : String {
        return this.question
    }

    fun setQuestion( q: String){
        this.question = q
    }
    fun getImage(): Int{
        return this.image
    }
    fun setImage(image: Int){
        this.image = image }
    fun getCorrectOption() : String{
        return this.correct
    }
    fun getOption1() : String{
        return this.options[0]
    }
    fun getOption2() : String{
        return this.options[1]
    }
    fun getOption3() : String{
        return this.options[2]
    }
    fun getOption4() : String{
        return this.options[3]
    }

}
