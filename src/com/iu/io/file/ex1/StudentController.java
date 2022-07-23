package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	
	//start()메서드가 있다
	//1. 학생정보 출력 - 모든학생정보출력
	//2. 학생정보 검색 - 
	//3. 학생정보 추가
	//4. 학생정보 삭제
	//5. 백		업 - 현재 리스트에있는 내용을 똑같은 파일로 덮어씌운다.
	//6. 종		료	
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentView view = new StudentView();
		StudentService service = new StudentService();
		
		boolean check = true;
		while(check) {
			StudentDAO dao = new StudentDAO();
			ArrayList<StudentDTO> dto = dao.getList();

			System.out.println("1. 학생정보 출력  2. 학생정보 검색  3. 학생정보 추가  \n4. 학생정보 삭제  5. 백\t 업  6. 종\t료");
			int num = sc.nextInt();
			
			if(num == 1) {
				view.view(dto);
			}else if(num == 2) {
				StudentDTO find = service.getStudent(dto);
				if(find != null) {
					view.view("찾은 학생 정보 출력");
					view.view(find);
				}else {
					view.view("없는 학생입니다.");
				}
			}else if(num == 3) {
				service.setStudentAdd(dto);
				
			}
			
		}
	}
 
}
