package br.com.tiagolivrera.SpringKotlin.converters

object NumberConverter {

    public fun convertToDouble(number: String?): Double {
        if (number.isNullOrBlank()) return 0.0
        // BR 10,20 US 10.20
        val num = number.replace(",".toRegex(), ".")
        return if (isNumeric(num)) num.toDouble() else 0.0
    }

    public fun isNumeric(number: String?): Boolean {
        if (number.isNullOrBlank()) return false
        val num = number.replace(",".toRegex(), ".")
        return num.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}