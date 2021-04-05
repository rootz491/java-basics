#	Caution ⚠️

**a bug's here**


*	i was following this article here:	[GeeksForGeeks](https://www.geeksforgeeks.org/how-to-create-a-rest-api-using-java-spring-boot/)

*	application is not reponding with correct data i.e.

```r
http://localhost:8080/employees/
```

    should respond with *list of default employees*

*	But is responding with `404` & _path not found_!

##	where's Bug?

*	i think bug is at `employeeController.java` file located at path:
```
src/main/java/com/learning/employee/
```

*	so good luck future me! fix this when you'll get along with java (Spring Boot)

##	want to run locally?

to run locally, open shell and go to root of this project. Then, use the following command:

```bash
$	./mvnw spring-boot:run
```