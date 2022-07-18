package com.iu.lang.string;

public class StringMain1 {

	public static void main(String[] args) {
		
		//"iu"라는 상수는 메서드 영역(상수영역)에 따로 만들어져서 주소값을 참조한다.
		//str1과 str2는 "iu"상수영역의 주소값을 가지고
		//str3는 따로 힙영역에 객체가 생성되어 다른 주소값을 가진다.
		String str1 = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		//toString이 자동 출력
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//해당하는 실제 데이터를 비교하는것 equals메서드를 오버라이딩하여 사용.
		System.out.println("==============================");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		
		StringStudy ss = new StringStudy();
		ss.studyCharAt();
		
		System.out.println("==============================");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		System.out.println("===============================");
		StringStudy2 st2 = new StringStudy2();
		st2.studyIndexof();
		
		System.out.println("===============================");
		st2.studyIndexOfEx1();
		
	}

}
