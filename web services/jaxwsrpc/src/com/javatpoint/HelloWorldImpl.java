package com.javatpoint;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.javatpoint.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}