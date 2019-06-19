package query.value.bug.example

import io.micronaut.http.annotation.Controller
import javax.inject.Singleton

@Singleton
@Controller("/test")
open class ExampleController : ExampleOperations {
    override fun get(test: Boolean): Boolean {
        return true
    }
}
