package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	      AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	   
	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
	      helloWorld.setMessage("Hello World!");
	      helloWorld.getMessage();
	      
	      HelloWorld helloWorld12 = ctx.getBean(HelloWorld.class);
	      
	      helloWorld12.getMessage();
	      
 HelloWorld helloWorld123 = ctx.getBean(HelloWorld.class);
	      
	      helloWorld123.getMessage();
	   }
}
