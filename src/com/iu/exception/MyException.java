package com.iu.exception;

public class MyException extends Exception {
	
	public MyException() {
		super("몰라요. 산수 포기"); //super()는 생략되어있다.
		// TODO Auto-generated constructor stub
	}
	
	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
