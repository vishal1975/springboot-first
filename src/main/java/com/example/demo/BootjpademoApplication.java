package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootjpademoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BootjpademoApplication.class, args);
		Test test=context.getBean(Test.class);
		test.setNo(3);
		int no=test.getNo();
		System.out.println(no);
		

	}

}
