package query.value.bug.example

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

interface ExampleOperations {
    @Get("{?test}")
    fun get(@QueryValue test: Boolean): Boolean
}
