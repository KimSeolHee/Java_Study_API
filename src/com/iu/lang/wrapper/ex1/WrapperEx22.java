package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx22 {

	//강사님 풀이
	public void juminCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String jumin = "971224-1234567";
		
		int count = 2;//*2~ 따로 선언
		int sum = 0;//누적
		for(int i = 0;i<jumin.length()-1;i++) {
			
			
			if(i == 6) {
				continue;
			}
			//1. 하나의 문자열에서 일부분 들어내는것 substring();
//			String num = jumin.substring(i,i+1);//1,2/2,3 ... 
//			int n = Integer.parseInt(num);
			
			//2. 하나의 문자열에서 하나씩 빼는것 charAt();
			char ch = jumin.charAt(i);//1,2,3,...
//			int n = Integer.parseInt(ch+"");//1번째 방법
//			String num = String.valueOf(ch);
//			int n = Integer.parseInt(num);//2번째 방법
			int n = Integer.parseInt(String.valueOf(ch));//2번째 방법의 한줄작성방법
			
			//n*2,n*3...
			
			sum = sum + n*count;
			count++;
		}
		
		//나머지구하기
		int check = sum % 11;
		check = 11-check;
		if(check > 9) {
			check = check % 10;
		}
		//체크용번호
		int checkNum = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		
		if(check == checkNum) {
			System.out.println("정상 주민번호");
		}else {
			System.out.println("비정상 주민번호");
		}

	}

	
	
	
	
}
