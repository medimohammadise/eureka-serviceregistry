package com.microservice.eurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaserverApplication

fun main(args: Array<String>) {
	runApplication<EurekaserverApplication>(*args)
}
