package de.darthkali.rest.webservices.restfulwebservices.user

import java.util.*

data class User(
    var id: Int? = null,
    var name: String? = null,
    var birthDate: Date? = null
) {
    override fun toString(): String {
        return "User(id=$id, name='$name', birthDate=$birthDate)"
    }
}

