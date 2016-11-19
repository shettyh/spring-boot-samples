package com.ms.springboot.rest.requests;

/**
 * Rest request
 * @author manjunathshetty
 *
 */
public class HelloRequest {

	private long id;

	private String name;
	
	public HelloRequest() {
	}

	public HelloRequest(long id, String name) {
		setId(id);
		setName(name);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
