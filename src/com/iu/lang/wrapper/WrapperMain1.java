package com.iu.lang.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String num = "10";
		
		
		Integer integer = new Integer(num);
		int n = integer.intValue();
		
		n = 50;
		integer = new Integer(n);
		
		integer = n; //auto-boxing 정수값 int를 참조타입으로 바꿔주고
		n = integer; //auto-unboxing 자동으로 int타입으로 벗겨낸다.
		
		long l = 10L;
		Long ll = l;
		
		integer = (int)l;
		// ↓ 레퍼런스 타입으로 변환 불가
		//integer = ll;
		// 같은 프리미티브타입만 형변환되고 레퍼런스 타입은 형변환 불가.
		
		
		String num1 = "50";
		String num2 = "3.12";
		String num3 = "60";
		
		//클래스명.parse클래스명("문자열"): 문자열을 primitive타입으로 변경
		
		int n1 = Integer.parseInt(num1);
		double n2 = Double.parseDouble(num2);
		long n3 = Long.parseLong(num3);
		
//		System.out.println(n1*2);
//		System.out.println(n2*2);
//		System.out.println(n3*2);
//		
		
//		
//		System.out.println(num+2);
		
	
		

	}

}
