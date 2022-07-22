package com.iu.exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public void t4() throws MyException, Exception {
		//유치원생 프로그램
		//0~99
		int num = 48;
		int num2 = 82;
		int num3 = num + num2; //예외 - 문법상으로는 문제없지만 유치원생은 알 수가 없다.
		int num4 = num - num2; //예외
		
		if(num3 > 99) {
			throw new Exception("????");
		}
		
		if(num4<0) {
			throw new MyException("그런 숫자 몰라요");
		}
	}
	
	
	//메서드에서 발생할 예외 객체를 던짐. 여러개 가능
	public void t3() throws NullPointerException, ArithmeticException, InputMismatchException, Exception, Throwable {
		String str = null;
		System.out.println(str.toString());
	}
	
	public void t2() {
		
		String [] str = {"10","five","3.14","0"};
		Scanner sc = new Scanner(System.in);
		for(String s : str) {
			try {
				System.out.println("숫자를 입력하세요.");
				int n = sc.nextInt();
				int num = Integer.parseInt(s);
				num = 10/num;
				System.out.println(num);
			}catch(NumberFormatException e) {
				System.out.println("예외처리 완료");
			}catch(ArithmeticException e) {
				System.out.println("수학오류 해결");
			}catch(Exception e) {
				e.printStackTrace();//메세지를 뿌려줌 강제종료X
			}catch(Throwable e) {
				System.out.println("모든 오류 해결");
			}
			
		}
	}
	
	public void t1() {
		System.out.println("t1 메서드 실행");
		Random random = new Random();
		
		String str = null;		
		if(random.nextInt(10)%2==0) {
			str="10";
		}
		
		int num = Integer.parseInt("10");
		try {
			num = num / 0;
			System.out.println(num);
		}catch(ArithmeticException e) {
			System.out.println("예외처리");
		}

		
		System.out.println(str.toString());
		new NullPointerException();//JVM이 객체를 만들어서 알려주는것임.
		
		System.out.println("t1 메서드 종료");
	}

}
