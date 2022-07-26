package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentView {
	
	//view 3개
	//1. String 매개변수로 받아서 출력
	//2. StudentDTO출력하는 메서드
	//3. ArrayList<StudentDTO>받아서 출력하는
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(ArrayList<StudentDTO> ar) {
		
		for(int i = 0; i < ar.size();i++) {
			StudentDTO dto = ar.get(i);
			this.view(dto);
		}	
		
//		for(StudentDTO d:dto) {
//			System.out.println("이름 : " + d.getName());
//			System.out.println("번호 : " + d.getNum() + "번");
//			System.out.println("국어성적 : " + d.getKor() + "점");
//			System.out.println("영어성적 : " + d.getEng() + "점");
//			System.out.println("수학성적 : " + d.getMath() + "점");
//			System.out.println("=================");
//		}
	}

	public void view(StudentDTO dto) {
		System.out.println("이름 : " + dto.getName());
		System.out.println("번호 : " + dto.getNum() + "번");
		System.out.println("국어성적 : " + dto.getKor() + "점");
		System.out.println("영어성적 : " + dto.getEng() + "점");
		System.out.println("수학성적 : " + dto.getMath() + "점");
		System.out.println("총	점 : " + dto.getTotal() + "점");
		System.out.println("평	균 : " + dto.getAvg() + "점");
		System.out.println("===============");
	}

}
