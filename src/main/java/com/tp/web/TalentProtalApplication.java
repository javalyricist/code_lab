package com.tp.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//SpringBootServletInitializer allows you to configure your application 
//when it’s launched by the servlet container
@SpringBootApplication
public class TalentProtalApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TalentProtalApplication.class, args);
	}
	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(TalentProtalApplication.class);
	  }

}
