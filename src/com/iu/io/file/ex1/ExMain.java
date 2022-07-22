package com.iu.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) throws Exception {

		StudentDAO dao = new StudentDAO();
		ArrayList<StudentDTO> dto = dao.getList();		
		for(StudentDTO d:dto) {
			System.out.println(d.getName());
			System.out.println(d.getNum());
			System.out.println(d.getKor());
			System.out.println(d.getEng());
			System.out.println(d.getMath());
			System.out.println("=================");
		}
		
		StudentService service = new StudentService();
		service.getList();
		
		service.getStudent(dto);

		
	}

}
