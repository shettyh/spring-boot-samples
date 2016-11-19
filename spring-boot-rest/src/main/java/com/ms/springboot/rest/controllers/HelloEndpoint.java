package com.ms.springboot.rest.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ms.springboot.rest.resources.HelloResource;

/**
 * 
 * Rest Endpoint
 * 
 * @author manjunathshetty
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloEndpoint {

	private static AtomicLong idGen = new AtomicLong();

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayHello() {
		return "Hello World!";
	}

	@RequestMapping(path = "advanced", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResource sayHello(@RequestParam("name") String name) {
		return new HelloResource(idGen.incrementAndGet(), name);
	}

	@RequestMapping(path = "moreadvanced", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> sayHelloWithStatus(@RequestParam(name = "name", defaultValue = "xyz") String name) {
		HelloResource helloResource = new HelloResource(idGen.incrementAndGet(), name);
		return ResponseEntity.status(HttpStatus.OK).body(helloResource);
	}

}
