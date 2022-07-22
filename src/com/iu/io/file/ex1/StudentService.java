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

	//학생한명을 찾는다.찾으려고 하는 학생의 번호를 입력받아서
	//찾은 학생을 리턴
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
		
		return 0;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		
		
	}
	

}
