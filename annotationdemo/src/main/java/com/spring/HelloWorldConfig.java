package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({ "com.spring" })
public class HelloWorldConfig {
	
	
   @Bean
  @Scope("prototype")
  // @Autowired
 public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
