package org.vaadin.example

import org.springframework.stereotype.Service
import java.io.Serializable

@Service
open class GreetService : Serializable {
    fun greet(name: String?): String = if (name.isNullOrEmpty()) {
        "Hello anonymous user"
    } else {
        "Hello $name"
    }
}
