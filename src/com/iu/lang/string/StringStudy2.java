package com.iu.lang.string;

public class StringStudy2 {
	
	public void studyIndexOfEx1() {
		String names = "iu,suji,choa,hani";
		//1. names에는 몇개의 쉼표가 있는가?
		//2. 총 몇명이 있습니까?
		
		boolean check = true;
		int count = 0;
		int i = 0;
		int index = 0;//찾은 인덱스 번호
		while(check) {
			index = names.indexOf(",", index);
			
			if(index == -1) {
				check = !check;
				break;
			}else {
				count++;
				index++;
			}
		}
		System.out.println(",의 갯수 : " + count);
		System.out.println("인원 수 : "+ (count+1)+"명");
		
		
		
		
//		int result = names.indexOf(",", 0);
//		int count=0;
//		for(int i = 0;i<names.length();i++) {
//			result = names.indexOf(",", result+i);
//			if(result == -1) {
//				break;
//			}else {
//				count++;
//			}
//			System.out.println("\',\'인덱스번호 : "+result);
//		}
//		System.out.println("\',\'는 몇 개? "+count);
//		
//		String [] name = names.split(",");
//		for(int i = 0;i<name.length;i++) {
//			System.out.println("name "+i+": " + name[i]);
//		}
	}
	
	public void studyIndexof() {
		String str = "Hello Java";
		int result = str.indexOf('H');
		System.out.println(result);
	}
	
}
