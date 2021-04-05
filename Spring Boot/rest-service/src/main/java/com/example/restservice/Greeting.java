package com.example.restservice;

public class Greeting {
	public final long id;
	public final String context;

	public Greeting(long id, String context) {
		this.id = id;
		this.context = context;
	}

	//	getter
	public long getId() {
		return id;
	}

	public String getContext() {
		return context;
	}
}