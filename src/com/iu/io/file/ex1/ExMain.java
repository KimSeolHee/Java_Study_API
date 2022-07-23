package com.iu.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) throws Exception {

		StudentDAO dao = new StudentDAO();
		ArrayList<StudentDTO> dto = dao.getList();
		
		StudentView view = new StudentView();
//		view.view(dto);
//		view.view("하이");
		
		
		
		StudentService service = new StudentService();
//		service.getList();
//		
		
//		service.setStudentAdd(dto);
//		service.setStudentDelete(dto);
//
//		StudentDTO aa = service.getStudent(dto);
//
//		view.view(aa);
		
		StudentController controll = new StudentController();
		controll.start();
		
	}

}
