package com.iu.lang.string;

public class StringStudy {
	
	public void studyCharAt() {
		char[] ch = {'H','e','l','l','o',' ','W','o','r','l','d'}; 
		String str = "Hello World!";
		
		//새로운 문자열로 바꿈
		System.out.println("---------------------------");
		String replace = str.replace('l', 'x');
		System.out.println(replace);
		System.out.println(str);
		
		str = "Google에 입사지원동기는...Google에 입사하면 노예가 되겠습니다.";
		System.out.println(str);
		str = str.replace("Google", "Samsung");
		System.out.println(str);
		System.out.println("---------------------------");
		
		System.out.println(ch[0]);
		char c = str.charAt(0);
		System.out.println(c);
		
		c = str.charAt(1);
		System.out.println(c);
		
		System.out.println(str.length());
		
		System.out.println("==========================");
		//str 문자열을 하나씩 꺼내서 출력
		
//		for(int i = 0;i <str.length();i++) {
//			c = str.charAt(i);
//			System.out.println("출력: " + c);
//		}
//	
		System.out.println("-.-.-.-.-.-.--.-.-.-.--.-.");
		str ="hi";
		String str2=" hi ";
		str2 = str2.trim(); //공백제거
//		str2 = str2.replace(" ", "");
		System.out.println(str.equals(str2));
		System.out.println("-.-.-.-.-.-.-.--.-.-.-.-.-.-.-");
	}
	
	public void studySubString() {
		String member = "iu/1234";
		//하나의 문자열을 분리하는 작업(parsing)
		String pw = member.substring(3);
		String id = member.substring(0, 2);//2번인덱스 미만 && 0번부터 2글자만 가져오기!
		System.out.println(pw);
		System.out.println(id);
	}
	
}
