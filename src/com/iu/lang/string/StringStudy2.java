package com.iu.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void ex2() {
		//1. 키보드로부터 파일명을 입력 받음, abc.txt
		//2. 파일이 이미지 파일인지 아닌지 구별하기 indexOf(".") > subString(indexOf("."))
		//3. 이미지 파일이면 이미지 파일입니다. 아니면 아니라 출력함.
		//4. 확장자가 jpg,png,gif,jpeg
		
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		while(check) {
			System.out.println("파일명을 입력해주세요.");
			String fileName = sc.next();
			
			int num = fileName.indexOf(".");
			String file = fileName.substring(num+1);
			System.out.println("확장자 : "+ file);
			
			if(file.equals("jpg") || file.equals("png")) {
				System.out.println("이미지 파일입니다.");
			}else if(file.equals("gif") || file.equals("jpeg")) {
				System.out.println("이미지 파일입니다.");
			}else {
				System.out.println("이미지 파일이 아닙니다.");
				check = !check;
				break;
			}
			System.out.println("==================================");
		}
	}
	
	
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
