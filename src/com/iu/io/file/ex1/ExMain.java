package com.iu.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) throws Exception {
		
		StudentController controll = new StudentController();
		controll.start();
		
		//DAO테스트
//		StudentDAO dao = new StudentDAO();
//		ArrayList<StudentDTO> dto = dao.getList();
//
//		dao.setList(dto);
		
	}

}
