package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	//DTO : Data Transfer Object 데이터 운반 객체
	//DAO : Data Access Object 데이터 접근 객체
	//file data에 접근

	//1. getList
	//studentData 파일의 내용을 읽어서 작업
	//가져와서 리턴
	
	public ArrayList<StudentDTO> getList() throws Throwable {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		//파일 읽어오기
		File file = new File("C:\\Study","studentData.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		boolean check = true;
		while(check) {
			String name = br.readLine();
			if(name==null) {
				break;
			}
//			System.out.println(name);
			
			StringTokenizer token = new StringTokenizer(name,",");
			StudentDTO dto = new StudentDTO();
			
			dto.setName(token.nextToken());
			dto.setNum(Integer.parseInt(token.nextToken().trim()));
			dto.setKor(Integer.parseInt(token.nextToken()));
			dto.setEng(Integer.parseInt(token.nextToken()));
			dto.setMath(Integer.parseInt(token.nextToken()));
			
			ar.add(dto);	
		}
		return ar;
		
	}
	
}
