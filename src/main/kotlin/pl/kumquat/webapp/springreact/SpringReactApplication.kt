package pl.kumquat.webapp.springreact

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringReactApplication

fun main(args: Array<String>) {
    runApplication<SpringReactApplication>(*args)
}
