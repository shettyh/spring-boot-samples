package com.ms.springboot.rest.resources;

/**
 * Rest resource
 * 
 * @author manjunathshetty
 *
 */
public class HelloResource {

	private long id;

	private String name;

	public HelloResource(long id, String name) {
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
