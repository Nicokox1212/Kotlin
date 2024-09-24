package com.example.mojaaplikacjanicolaallocca

import androidx.compose.ui.text.font.FontWeight
import java.util.Locale.IsoCountryCode

data class Niko(
    var Id:Int,
    var name:String,
    var country:String,
    val  weight: Double,
    var countryCode:String,
    val family:String ?= null
)

fun main(){
    val listOfNiko: MutableList<Niko> = mutableListOf()
    listOfNiko.add(Niko(1, "Broccoli", "Poland", 36.6, "333"))
    listOfNiko.add(Niko(2, "Jabko", "Poland", 37.6, "335473"))
    listOfNiko.add(Niko(3, "Banana", "Italy", 39.6, "3433"))
    listOfNiko.add(Niko(4, "Pomidor", "Germant", 46.6, "33643"))


    val weight = countWeightNiko(listOfNiko)
    println("Waga warzyw wynosi $weight")
    val findNiko = isfindNiko((listOfNiko))
    println("Znaleziona tabela to $findNiko")
}

fun isfindNiko(listOfNiko: MutableList<Niko>): Niko? {
    return  listOfNiko.find { it.name=="Jabko" }
    
}

fun countWeightNiko(listOfNiko:MutableList<Niko>):Double{
    return listOfNiko.sumByDouble { it.weight }
}
