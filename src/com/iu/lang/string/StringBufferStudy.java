package com.iu.lang.string;

public class StringBufferStudy {

	public static void main(String[] args) {
		String str1 = "max";
		String str2 = "age";
		
		str1 = str1 + str2; //객체 3개
		
		StringBuffer sb = new StringBuffer(); //객체를 1개로 만듬
		sb.append(str1);
		sb.append(str2);
		sb.append(10);
		
		String result = sb.toString(); //타입이 다름 sb는 StringBuffer타입
		System.out.println(sb); 
		System.out.println(result);

		
		//객체 7개
		System.out.println("num1"+"1"+"num2"+"2");
		

	}

}
