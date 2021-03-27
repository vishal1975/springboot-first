package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Test {
	
	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Test() {
		// TODO Auto-generated constructor stub
		System.out.println("This is the constructor of test");
	}

}
