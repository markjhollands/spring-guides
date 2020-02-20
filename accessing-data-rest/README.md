# accessing-data-rest
[Spring.io - Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)

Rest of this document is inspired by the [Spring.io - Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/) tutorial.

## Run

```bash
./mvnw spring-boot:run
```

## Build and run

```bash
./mvnw clean package
java -jar target/accessing-data-rest-0.0.1-SNAPSHOT.jar
```

## Testing the application

First you want to see the top level service:

```bash
curl http://localhost:8080
```

Show the people records:

```bash
curl http://localhost:8080/people
```

Create a person:

```bash
curl -i -H "Content-Type:application/json" -d '{"firstName": "Frodo", "lastName": "Baggins"}' http://localhost:8080/people
```

Query for all people:

```bash
curl http://localhost:8080/people
```

Query for an individual record:

```bash
curl http://localhost:8080/people/1
```

Show all custom queries:

```bash
curl http://localhost:8080/people/search
```

Use `findByLastName` query:

```bash
curl http://localhost:8080/people/search/findByLastName?name=Baggins
```

Example `PUT`:

```bash
curl -X PUT -H "Content-Type:application/json" -d '{"firstName": "Bilbo", "lastName": "Baggins"}' http://localhost:8080/people/1
```

Example `PATCH`:

```bash
curl -X PATCH -H "Content-Type:application/json" -d '{"firstName": "Bilbo Jr."}' http://localhost:8080/people/1
```

Example `DELETE`:

```bash
curl -X DELETE http://localhost:8080/people/1
```