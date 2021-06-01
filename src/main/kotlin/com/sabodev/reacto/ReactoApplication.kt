package com.sabodev.reacto

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactoApplication

fun main(args: Array<String>) {
    runApplication<ReactoApplication>(*args)
}
