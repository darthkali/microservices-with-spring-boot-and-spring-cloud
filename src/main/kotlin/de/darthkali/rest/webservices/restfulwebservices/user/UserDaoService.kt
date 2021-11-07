package de.darthkali.rest.webservices.restfulwebservices.user

import java.util.Date
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component


@Component
class UserDaoService(
    private val users: MutableList<User> = mutableListOf()

) {
    var logger: Logger = LoggerFactory.getLogger(UserDaoService::class.java)

    init {
        users.add(User(1, "Adam", Date()))
        users.add(User(2, "Eve", Date()))
        users.add(User(3, "Jack", Date()))
    }

    fun findAll(): List<User> {
        return users
    }

    fun findOne(id: Int): User? {

        users.forEach {
            if (it.id == id) {
                return it
            }
        }
        return null
    }

    fun save(user: User): User {
        return user.let {
            if (it.id == null) {
                user.id = users.count() + 1
                logger.info("id was null")
            }
            users.add(it)
            logger.info("user was added")
            it
        }
    }
}