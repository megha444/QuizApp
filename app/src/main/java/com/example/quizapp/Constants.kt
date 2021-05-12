package com.example.quizapp

object Constants{

    const val USER_NAME:String="Username"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS: String="correct_Answers"


fun getQuestions(): ArrayList<Questions>{
        val questionList=ArrayList<Questions>()


//Question 1
    val que1= Questions(1,
        "What country does this flag belong to?",
    R.drawable.ic_flag_of_argentina,
        "Argentina",
        "Australia",
        "Armenia",
        "Austria",
                1
    )
    questionList.add(que1)

    //Question 2
    val que2= Questions(2,
        "What country does this flag belong to?",
        R.drawable.ic_flag_of_australia,
        "Belgium",
        "Australia",
        "Aruba",
        "Austria",
        2
    )
    questionList.add(que2)

//Question 3
    val que3= Questions(3,
        "What country does this flag belong to?",
        R.drawable.ic_flag_of_belgium,
        "Bahamas",
        "Brazil",
        "Chile",
        "Belgium",
        4
    )
    questionList.add(que3)


//Question 4
    val que4= Questions(4,
        "What country does this flag belong to?",
        R.drawable.ic_flag_of_brazil,
        "Bulgaria",
        "Brazil",
        "Bolivia",
        "Bhutan",
        2
    )
    questionList.add(que4)

    //Question 5
    val que5= Questions(5,
        "What country does this flag belong to?",
        R.drawable.ic_flag_of_denmark,
        "Dominica",
        "Cyprus",
        "Denmark",
        "Cuba",
        3
    )
    questionList.add(que5)

//Question 6
    val que6= Questions(6,
        "What country does this flag belong to?",
        R.drawable.ic_flag_of_fiji,
        "Finland",
        "Fiji",
        "France",
        "Faroe",
        2
    )
    questionList.add(que6)

//Question 7
    val que7= Questions(7,
        "What country does this flag belong to?",
        R.drawable.ic_flag_of_germany,
        "Germany",
        "Ghana",
        "Greece",
        "Greenland",
        1
    )
    questionList.add(que7)

    //Question 8
    val que8= Questions(8,
        "What country does this flag belong to?",
        R.drawable.ic_flag_of_india,
        "Indonesia",
        "Italy",
        "India",
        "Iran",
        3
    )
    questionList.add(que8)

    //Question 9
    val que9= Questions(9,
        "What country does this flag belong to?",
        R.drawable.ic_flag_of_kuwait,
        "Kazakhstan",
        "Kuwait",
        "Kenya",
        "Krygyzstan",
        2
    )
    questionList.add(que9)

    //Question 10
    val que10= Questions(10,
        "What country does this flag belong to?",
        R.drawable.ic_flag_of_new_zealand,
        "Nigeria",
        "Netherlands",
        "Norway",
        "New Zealand",
        4
    )
    questionList.add(que10)


    return(questionList)

    }
}