# micronaut-query-value-bug-example
Example of Micronaut's @QueryValue annotation failing compilation step when parameter specified as not null


Issue: https://github.com/micronaut-projects/micronaut-core/issues/1812

### Task List

- [x] Steps to reproduce provided
- [x] Stacktrace (if present) provided
- [x] Example that reproduces the problem uploaded to Github
- [x] Full description of the issue provided (see below)

### Steps to Reproduce

1. Create a declarative client in kotlin like the following:
```Kotlin
interface ExampleOperations {
    @Get("{?test}")
    fun get(@QueryValue test: Boolean): Boolean
}
```
2. Attempt to build the project

### Expected Behaviour
The project should be able to compile and allow a non nullable Boolean `@QueryValue`.

### Actual Behaviour
We get the following compilation error expecting the `Boolean` property to be `Optional`
```
error: The uri variable [test] is optional, but the corresponding method argument [boolean test] is not defined as an Optional or annotated with the javax.annotation.Nullable annotation.
    public boolean get(boolean test) {
```

### Environment Information
- **Operating System**: macOS mojave 10.14.4
- **Micronaut Version:** 1.1.1
- **JDK Version:** 1.8.0_191

### Example Application

- https://github.com/joshfermin/micronaut-query-value-bug-example
