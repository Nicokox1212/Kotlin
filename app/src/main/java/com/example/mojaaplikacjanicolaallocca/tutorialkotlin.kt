package com.example.mojaaplikacjanicolaallocca

import android.webkit.WebStorage.Origin

//fun -> function
fun main() {

    //wypisywanie
//    println("hello")
//    println("xd")

    //types
    //int
    //string
    //char
    //boolean true/false


    // var -> variables
//    var number : Int = 124
//    var number2 = 125
//    var text = "jakis tekst"
//    var boolean = true // false
//    var decimalvalue : Float = 123.33F
//    println(number)

    // val -> values
//    val integerValue : Int = 123
//    val integerVariables : Int = 123

//    println("Uzytkownik")
//    val keyboardValue = readLine()
//
//    println(keyboardValue)

//var pointOfExam = 50
//    when (pointOfExam){
//        in 0..30 -> print("jedynka")
//        in 31..50 -> print("dwojka")
//        in 51..70 -> print("3")
//        in 71..80 -> print("4")
//        in 81..98 -> print("5")
//    }
//    var someValue : String = "some value"
//
//    when (someValue) {
//        "value" -> "it is value"
//    }
//}
//
//fun newFunction(value: Any){
//    when (value){
//        "value" -> println("it is value")
//        in 0..30 -> println("jedynka")
//        10 -> println("it is 10")
//        is String -> println("To jest string")
//        is Int -> println("To jest string")
//        true -> println("To jest true")
//        else -> {
//
//        }
//    }


// 2. Zadanie praktyczne dla uczniów.pdf
//        println("Podaj napis:")
//        val keyboardValue = readLine()?:""
//        val length = keyboardValue.length
//        println("Twój napis ma $length znaków")


//        println("Podaj napis:")
//        val keyboardValue = readLine() ?: ""
//
//        when (keyboardValue) {
//            "pomidor" -> println("pomidor")
//            "truskawka" -> println("truskawka")
//            else -> println("To nie jest ani truskawka ani pomidor")
//    }

    // 3. LEKCJAA //

//
//    val nullableValue : String? = null
//    val valueString : String = nullableValue ?: "To byla nullowalna wartosc"
//
//    println(valueString)
//    if (nullableValue == null){
//        "to byla nullowalna wartosc"
//
//    }else {
//        nullableValue
//    }

//    val summary = sumTwoNumbers(10, 24)
//    val summary2 = sumTwoNumbers2(10, 24)
//    val summary3 = sumTwoNumbers3(10, 24)
//    println(summary)
//    println(summary2)
//    println(summary3)

//}


//fun addItem(list: List<String>){
//    // Sie cos działo tutaj
//}
//
//fun sumTwoNumbers(x: Int, y: Int) : Int {
//    return x+y
//}
//
//fun sumTwoNumbers2(x: Int, y: Int) : Int = x+y
//
//fun sumTwoNumbers3(x: Int, y: Int) = x+y


// ZADANIE 1


    data class Vegetable(val name: String, val age: Int, val originCountry: String)

    var oldestVegetable: Vegetable? = null
    var maxValue: Int = 0

    val xd = Vegetable("Tomato", 10, "Spain")
    val xd2 = Vegetable("Cabbage", 3, "Japan")
    val xd3 = Vegetable("Cucumber", 11, "Great Britain")

    val mutableList = mutableListOf(xd, xd2, xd3)


    for (vegetable in mutableList) {
        if (vegetable.age > maxValue) {
            maxValue = vegetable.age
            oldestVegetable = vegetable
        }
    }

    if (oldestVegetable != null) {
        println("Najstarsze warzywo to: ${oldestVegetable.name}, jego wiek to: ${oldestVegetable.age}")
    }


    for (vegetable in mutableList) {
        println("${vegetable.name} pochodzi z ${vegetable.originCountry}")
    }
}