package br.com.tiagolivrera.SpringKotlin.services

import br.com.tiagolivrera.SpringKotlin.models.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong()

    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Finding one person")

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Thyago"
        person.lastName = "Freitas"
        person.address = "Rua das Flores"
        person.gender = "masculino"
        return person
    }
}