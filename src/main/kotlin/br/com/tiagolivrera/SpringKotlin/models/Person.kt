package br.com.tiagolivrera.SpringKotlin.models

/*
data class Person
    -> classes que geralmente representam tabelas em banco de dados, ou que tem algum tipo de armazenamento são data classes.
    -> usa-se var ao invés de val pois o JPA não foi construído para trabalhar com classes imutáveis ou os métodos gerados
        automaticamente pelas data classes.
 */
data class Person(
    var id: Long = 0,
    var firstName: String = "",
    var lastName: String = "",
    var address: String = "",
    var gender: String = ""
)
