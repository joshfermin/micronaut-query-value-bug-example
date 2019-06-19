package query.value.bug.example

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("query.value.bug.example")
                .mainClass(Application.javaClass)
                .start()
    }
}