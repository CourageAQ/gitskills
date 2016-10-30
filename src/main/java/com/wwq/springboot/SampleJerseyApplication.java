package com.wwq.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class SampleJerseyApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SampleJerseyApplication.class);
	}
	public static void main(String[] args) {
		new SampleJerseyApplication().configure(new SpringApplicationBuilder(SampleJerseyApplication.class)).run(args);
	}
}
