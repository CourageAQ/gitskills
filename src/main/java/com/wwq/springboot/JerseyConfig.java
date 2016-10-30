package com.wwq.springboot;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig(){
		/*this.packages("com.wwq.springboot").register(LoggingFilter.class);*/
		register(Endpoint.class);
		register(ReverseEndpoint.class);
	}
}
