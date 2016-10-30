package com.wwq.springboot;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class Endpoint {
	private Service service;
	
	@Autowired
	public Endpoint(Service service){
		this.service = service;
	}
	@GET
	public String message() {
		return "Hello " + this.service.message();


}
}
