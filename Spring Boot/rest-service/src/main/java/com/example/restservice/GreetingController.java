package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//	'@RestController' annotation marks the class as a controller where every method returns a domain object instead of a view
@RestController
public class GreetingController {

	private static final String template = "Hello, %s";
	private static final AtomicLong counter = new AtomicLong();

	//	'@GetMapping' annotation is reuest URLmapper to it's method.
	@GetMapping("/greeting")
	//	'@RequestParam' annotation binds the value of query string parameter (i.e. url/name=?) into the (String) name parameter this greeting() method. 
	//	if name is absent then defaultValue will be passed to method's parameter 'name'
	public Greeting greeting (@RequestParam(value = "name", defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
		//	Before sending back the Greeting instance as reponse,
		//	'Jackson' automatically converts the Greeting instance into JSON
	}
}