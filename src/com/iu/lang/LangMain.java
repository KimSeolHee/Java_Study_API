package com.iu.lang;

import java.util.*;

public class LangMain {

	public static void main(String[] args) {
		
		Object obj = new Object();
		String result = obj.toString();
		System.out.println(result);
		
		Member member = new Member();
		String result2 = member.toString();
		System.out.println(result2);
		
		MemberClient mc = new MemberClient();
		Car car = new Car();
		
		obj = member; //다형성
		
		boolean result3 = car.equals(mc);
		System.out.println(result3);
		
		Car car2 = new Car();
		boolean result4 = car.equals(car);
		System.out.println(car);
		System.out.println(car.toString());
		System.out.println(result4);

		//원래 주소값이 나와야하는데 오버라이딩으로 그냥 값이 나오게 만들어진거임.
		String name = "iu";
		System.out.println(name);

		

	}

}
