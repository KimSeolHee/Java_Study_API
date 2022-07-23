package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

//서비스: 서비스 로직 입력
public class StudentService implements Service {

	Scanner sc;
	
	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		StudentDAO dao = new StudentDAO();
		ArrayList<StudentDTO> ar = dao.getList();
		for(StudentDTO r : ar) {
			int total = r.getKor()+r.getEng()+r.getMath();
			double avg = total / 3;
			r.setTotal(total);
			r.setAvg(avg);
			System.out.println("총점 : "+r.getTotal()+"점");
			System.out.println("평균 : "+r.getAvg()+"점");
			System.out.println("============");
			
		}	
		return ar;
	}

	
	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		StudentDAO dao = new StudentDAO();
		int result = dao.setList(ar);
		
		return result;
	}

	
	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		System.out.println("찾을 학생의 번호를 입력하세요!");
		sc = new Scanner(System.in);
		int findNum = sc.nextInt();
		StudentDTO dto = new StudentDTO();
		dto = null;
		for(int i = 0;i<ar.size();i++) {
			int num = ar.get(i).getNum();
			if(findNum == num) {
				dto = ar.get(i);
				break;
			}
		}		
		return dto;
	}
	

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		sc = new Scanner(System.in);
		System.out.println("삭제 할 번호를 입력하세요.");
		int num = sc.nextInt();
		
		int result = 0;
		for(int i = 0;i<ar.size();i++) {
			if(num == ar.get(i).getNum()) {
				System.out.println("삭제 "+ar.get(i).getName()+" → "+ar.get(i).getNum()+"번");
				ar.remove(i);
				result = 1;
				break;
			}			
		}
		
		return result;
	}


	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		StudentDTO dto = new StudentDTO();
		sc = new Scanner(System.in);
		System.out.println("학생을 추가하세요.");
		System.out.println("이름 입력");
		dto.setName(sc.next());
		System.out.println("번호 입력");
		dto.setNum(sc.nextInt());
		System.out.println("국어성적 입력");
		dto.setKor(sc.nextInt());
		System.out.println("영어성적 입력");
		dto.setEng(sc.nextInt());
		System.out.println("수학성적 입력");
		dto.setMath(sc.nextInt());
		
		ar.add(dto);
	}

}
