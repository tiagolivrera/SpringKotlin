package br.com.tiagolivrera.SpringKotlin.exceptions

import java.lang.RuntimeException

class UnsupportedMathOperationException(exception: String?): RuntimeException(exception) {
}