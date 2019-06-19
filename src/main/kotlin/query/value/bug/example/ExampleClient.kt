package query.value.bug.example

import io.micronaut.http.client.annotation.Client

@Client("/test")
interface ExampleClient : ExampleOperations
