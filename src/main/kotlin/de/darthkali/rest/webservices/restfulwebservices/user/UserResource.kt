package de.darthkali.rest.webservices.restfulwebservices.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
class UserResource {

    @Autowired
    val service = UserDaoService()

    @GetMapping(path = ["/users"])
    fun retrieveAllUsers(): List<User> {
        return service.findAll()
    }

    @GetMapping(path = ["/users/{id}"])
    fun retrieveUser(@PathVariable id: Int): User? {
        return service.findOne(id)
    }

    @PostMapping(path = ["/users"])
    fun createUser(@RequestBody user: User): User {
        return service.save(user)
    }
}