package de.darthkali.rest.webservices.restfulwebservices.helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloWorldController {

    @GetMapping(path = ["/hello-world"])
    fun helloWorld(): String {
        return "Hello World"
    }

    @GetMapping(path = ["/hello-world-bean"])
    fun helloWorldBean(): HelloWorldBean {
        return HelloWorldBean(message = "Hello World2")
    }

    @GetMapping(path = ["/hello-world-bean/path-variable/{name}"])
    fun helloWorldPathVariable(@PathVariable name: String): HelloWorldBean {
        return HelloWorldBean(message = "Hello World $name")
    }
}