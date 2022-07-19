package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	Scanner sc = new Scanner(System.in);
	//juminCheck
	//주민번호 입력
	// 9   7   1   1  2  4 - 1  2  3  4  5  6 7
	//*2   3   4   5  6  7   8  9  2  3  4  5 
	//+18 21   4   5 12 28   8 18  6 12 20 30 체크용번호 
	//총합: 182
	//총합을 11로 나누어서 나머지를 구함
	//192  / 11로 나눈 몫17 나머지5
	//나머지를 11에서 뺀 결과
	//11-5 = 6  결과를 체크용 번호랑 같은지 비교해야함.
	//만약 위의 연산결과가 두자리라면 
	//위에서 연산결과를 다시 10으로 나눈 나머지와 체크용 번호를 비교
	//11-0=11
	//11/10 = 1 을 다시 체크용 번호와 비교
	

	public void juminCheck() {
		
		System.out.println("주민번호를 입력하세요.");
		String num = sc.next();
		String nums = num.replace("-", "");
		System.out.println(nums);
		
		int total = 0;
		int newCount=2;
		for(int i = 0;i<nums.length()-1;i++) {
			
			char count = nums.charAt(i);
			String counts = String.valueOf(count);
			int lastCount = Integer.parseInt(counts);
			
			int lastResult = lastCount*(newCount);
			System.out.print(lastResult+"\t");
			
			if(newCount > 8) {
				newCount = 1;
			}
			newCount++;
			total = lastResult + total;
		}
		

		System.out.println("\n======================================================================================================");
		System.out.println("총합 : "+total);
		
		int b = total % 11;
		System.out.println("나머지 : "+ b);
		
		String names = nums.substring(12,13);
		int c = Integer.parseInt(names);
		System.out.println("체크번호c : "+ c);
		
		int minus = 11-b;
		System.out.println("minus값 : "+minus);
		if(minus > 10) {
			minus = minus % 10;
			System.out.println("minus의 나머지 : "+ minus);
		}
		
		if(minus == c) {
			System.out.println("같아요.");
		}else {
			System.out.println("달라요.");
		}

	}

	
	
	
	
}
