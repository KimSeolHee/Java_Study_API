package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {

	private StudentDAO dao;
	private Scanner sc;
	
	public StudentService() {
		this.dao = new StudentDAO();
		this.sc = new Scanner(System.in);
	}
	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		ArrayList<StudentDTO> ar = dao.getList();
		for(StudentDTO r : ar) {
			int total = r.getKor()+r.getEng()+r.getMath();
			double avg = total / 3.0;
			r.setTotal(total);
			r.setAvg(avg);
		}	
		return ar;
	}

	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		return dao.setList(ar);
	}

	
	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		System.out.println("찾을 학생의 번호를 입력하세요!");
		int findNum = sc.nextInt();
		StudentDTO dto = null;
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
		System.out.println("삭제 할 학생번호를 입력하세요.");
		int num = sc.nextInt();
		
		int result = 0;
		for(int i = 0;i<ar.size();i++) {
			if(num == ar.get(i).getNum()) {
				System.out.println("삭제 "+ar.get(i).getName()+" → "+ar.get(i).getNum()+"번");
				StudentDTO st = ar.remove(i);
				if(st != null) {
					result = 1;
					break;
				}
			}			
		}
		
		return result;
	}


	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		StudentDTO dto = new StudentDTO();
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
		dto.setTotal(dto.getKor()+dto.getEng()+dto.getMath());
		dto.setAvg(dto.getTotal()/3.0);
		
		ar.add(dto);
	}

}
