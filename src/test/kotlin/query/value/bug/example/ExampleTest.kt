package query.value.bug.example

import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class ExampleTest {

    @Inject
    private lateinit var exampleClient: ExampleClient

    @Test
    fun exampleTest() {
        exampleClient.get(true)
    }

}
