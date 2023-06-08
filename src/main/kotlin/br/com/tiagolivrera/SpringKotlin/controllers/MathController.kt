package br.com.tiagolivrera.SpringKotlin.controllers

import br.com.tiagolivrera.SpringKotlin.converters.NumberConverter.convertToDouble
import br.com.tiagolivrera.SpringKotlin.converters.NumberConverter.isNumeric
import br.com.tiagolivrera.SpringKotlin.exceptions.DivideByZeroException
import br.com.tiagolivrera.SpringKotlin.exceptions.UnsupportedMathOperationException
import br.com.tiagolivrera.SpringKotlin.math.SimpleMath
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController {

    private val math: SimpleMath = SimpleMath()

    @RequestMapping(value = ["sum/{numberOne}/{numberTwo}"])
    fun sum(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Por favor, use um valor numérico")
        return math.sum(convertToDouble(numberOne), convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["sub/{numberOne}/{numberTwo}"])
    fun sub(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Por favor, use um valor numérico")
        return math.sub(convertToDouble(numberOne), convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["mut/{numberOne}/{numberTwo}"])
    fun mut(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Por favor, use um valor numérico")
        return math.mut(convertToDouble(numberOne), convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["div/{numberOne}/{numberTwo}"])
    fun div(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Por favor, use um valor numérico")
        if (convertToDouble(numberTwo).equals(0.0)) throw DivideByZeroException("O divisor não pode ser zero")
        return math.div(convertToDouble(numberOne), convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["med/{numberOne}/{numberTwo}"])
    fun med(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Por favor, use um valor numérico")
        return math.med(convertToDouble(numberOne), convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["sqt/{numberOne}"])
    fun sqt(
        @PathVariable(value = "numberOne") numberOne: String?
    ): Double {
        if (!isNumeric(numberOne))
            throw UnsupportedMathOperationException("Por favor, use um valor numérico")
        if (convertToDouble(numberOne) < 0.0) throw UnsupportedMathOperationException("Por favor, use apenas valores positivos")
        return math.sqt(convertToDouble(numberOne))
    }
}