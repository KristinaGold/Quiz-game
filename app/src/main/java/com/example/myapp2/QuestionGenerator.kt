package com.example.myapp2

class QuestionGenerator {

   constructor()

    fun question1(): Question{

        val question1: String = "Which country's flag is: "
        val image = R.drawable.belgium
        val option1 = "Malaysia"
        val option2 = "Germany"
        val option3 = "Pagaruyung"
        val correctOption ="Belgium"
        val qList = arrayOf(option1, option2, option3, correctOption)
        val question = Question(question1, image, qList , correctOption)

        return  question
    }

    fun question2(): Question{

        val question1: String = "In which country 'Annyeong' is Hello? "
        val image = R.drawable.hello
        val option1 = "Thailand"
        val option2 = "Mongolia"
        val option3 = "Japan"
        val correctOption ="Korea"
        val qList = arrayOf(option1, correctOption,option2, option3)
        val question = Question(question1, image, qList,correctOption )

        return  question
    }

    fun question3(): Question{

        val question1: String = "What is this country's national drink? "
        val image = R.drawable.germanyflag
        val option1 = "tea"
        val option2 = "sake"
        val option3 = "wine"
        val correctOption ="beer"
        val qList = arrayOf(option1, option2, correctOption, option3)
        val question = Question(question1, image, qList ,correctOption)

        return  question
    }

    fun question4(): Question{

        val question1: String = "What country looks like this on the map? "
        val image = R.drawable.boot
        val option1 = "South Africa"
        val option2 = "Japan"
        val option3 = "Mexico"
        val correctOption ="Italy"
        val qList = arrayOf(correctOption, option1, option2, option3)
        val question = Question(question1, image, qList ,correctOption)

        return  question
    }

    fun question5(): Question{

        val question1: String = "Which country is associated with this animal? "
        val image = R.drawable.kangaroo
        val option1 = "Iran"
        val option2 = "Brazil"
        val option3 = "Ghana"
        val correctOption ="Australia"
        val qList = arrayOf( option1,correctOption, option2, option3)
        val question = Question(question1, image, qList ,correctOption)

        return  question
    }

    fun question6(): Question{

        val question1: String = "What was invented in this country? "
        val image = R.drawable.united_kingdom
        val option1 = "tea"
        val option2 = "fish and chips"
        val option3 = "ketchup"
        val correctOption ="football"
        val qList = arrayOf(option1, option2, option3,correctOption)
        val question = Question(question1, image, qList,correctOption )

        return  question
    }
}