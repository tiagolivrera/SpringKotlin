package br.com.tiagolivrera.SpringKotlin.exceptions

import java.lang.RuntimeException

class DivideByZeroException(exception: String?): RuntimeException(exception) {
}