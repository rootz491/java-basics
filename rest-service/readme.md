#	DEMO APP

this is just a demo web service that i created in order to understand Spring boot.

##	requests:

*	it can only handle `Get` request.

1.	/greeting
```r
http://localhost:8080/greeting
```

will return the JSON response:
```json
{"id":1,"context":"Hello, world"}
```

2.	/greeting?name=karan
```r
http://localhost:8080/greeting?name=karan
```

will return the JSON response:
```json
{"id":12,"context":"Hello, karan"}
```

##	to tun it on you machine (localhost)

>	I've used Maven here so there are 2 ways to run the service locally.

1.	using Mavern:
```bash
$	./mvnw spring-boot:run
```

2.	built the JAR file and run:
```bash
$	./mvnw clean package

$	java -jar target/rest-service-0.0.1-SNAPSHOT.jar
```

and vollah, it's up;
**cheers.**

