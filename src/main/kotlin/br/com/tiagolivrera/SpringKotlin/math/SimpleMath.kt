package br.com.tiagolivrera.SpringKotlin.math

import kotlin.math.sqrt

class SimpleMath {

    fun sum(numberOne: Double, numberTwo: Double) = numberOne + numberTwo

    fun sub(numberOne: Double, numberTwo: Double) = numberOne - numberTwo

    fun mut(numberOne: Double, numberTwo: Double) = numberOne * numberTwo

    fun div(numberOne: Double, numberTwo: Double) = numberOne / numberTwo

    fun med(numberOne: Double, numberTwo: Double) = (numberOne + numberTwo)/2.0

    fun sqt(number: Double) = sqrt(number)

}