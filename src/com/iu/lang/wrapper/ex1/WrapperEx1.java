package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	
	//ex1()
	//Scanner에서 주민번호를 입력받는다. : 앞 6-뒤 7자리 : 971224-1234567
	//1. 남자 여자 판단
	//2. 현재 나이 출력(대략계산)
	//3. 3월~5월 사이는 봄 /6~8월 사이 여름 /9~11 가을/12~2 겨울

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		boolean check = true;
		while(check) {
			System.out.println("주민번호를 앞자리를 입력하세요.");
			String nums = sc.next();
			
			String num = nums.replace("-", "");
			System.out.println(num);
			
			if(num.length()!=13) {
				System.out.println("재입력해주세요.");
				
				nums = sc.next();
				num = nums.replace("-", "");
				System.out.println(num);
			}
			
			String age = num.substring(0,2);
			int ages = Integer.parseInt(age);
			if(ages <= 93) {
				System.out.println("30대입니다.");
			}else if(ages > 93) {
				System.out.println("29세 이하입니다.");
			}
			
			String weather = num.substring(2, 4);
			int weathers = Integer.parseInt(weather);
			if(weathers >= 3 && weathers <= 5) {
				System.out.println("봄에 태어났습니다.");
			}else if(weathers >= 6 && weathers <= 8) {
				System.out.println("여름에 태어났습니다.");
			}else if(weathers >= 9 && weathers <=11) {
				System.out.println("가을에 태어났습니다.");
			}else {
				System.out.println("겨울에 태어났습니다.");
			}
			
			String gender = num.substring(6,7);
			int genders = Integer.parseInt(gender);
			if(genders == 2 || genders == 4) {
				System.out.println("여성입니다.");
			}else {
				System.out.println("남성입니다.");
			}
			
			System.out.println("============================");

		}
		

	}
	
	private void check1(String jumin) {
		char ch = jumin.charAt(7);
		if(ch=='1' || ch=='3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	
	String jumin ="971224-1234567";
	private void age(String jumin) {
		String year = jumin.substring(0,1);
		System.out.println(year);
	}
	
	private void season() {
//		String weather = jumin.substring(2, 4);
//		int weathers = Integer.parseInt(weather);
//		if(weathers >= 3 && weathers <= 5) {
//			System.out.println("봄에 태어났습니다.");
//		}else if(weathers >= 6 && weathers <= 8) {
//			System.out.println("여름에 태어났습니다.");
//		}else if(weathers >= 9 && weathers <=11) {
//			System.out.println("가을에 태어났습니다.");
//		}else {
//			System.out.println("겨울에 태어났습니다.");
//		}
	}
	
}
