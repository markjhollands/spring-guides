# accessing-data-rest
[Spring.io - Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)

Rest of this document is inspired by the [Spring.io - Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/) tutorial.

## Run

```bash
./mvnw spring-boot:run
```

## Build and run

```bash
./mvnw clean package
java -jar target/rest-service-0.0.1-SNAPSHOT.jar
```

## Testing the application

Default request with no query parameters:

```bash
curl http://localhost:8080/greeting
```

Request with `name` parameter:

```bash
curl http://localhost:8080/greeting\?name\=User
```