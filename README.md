# springboot-gradle-integration-test-starter
Starter Spring Boot 3 project with gradle and integration test setup

- Java 17 with gradle wrapper
- Gradle integration tests with [JVM Test Suite Plugin](https://docs.gradle.org/current/userguide/jvm_test_suite_plugin.html#configure_the_type_of_a_test_suite)
- MongoDB and `flapdoodle.embed.mongo`
- Populate test data with `Jackson2RepositoryPopulatorFactoryBean`


```shell
./gradlew build --console=plain
```