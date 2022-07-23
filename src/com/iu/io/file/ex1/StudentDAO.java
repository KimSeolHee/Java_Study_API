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
	
	//2. setList
	public int setList(ArrayList<StudentDTO> ar) {
		//예외 처리는 내부에서 처리
		//리스트로 받은 데이터들을 studentData에다가 작성한다.
		//기존의 내용은 삭제
		//작성형식은 기존 내용의 형식과 동일하게 
		//1. 리턴 : 정상적인성공
		//2. 리턴 : 예외가 발생했을경우
		return 0;
	}
	
	
	
	
	
	
	
	
	
	public ArrayList<StudentDTO> getList() throws Exception {
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
			dto.setKor(Integer.parseInt(token.nextToken().trim()));
			dto.setEng(Integer.parseInt(token.nextToken().trim()));
			dto.setMath(Integer.parseInt(token.nextToken().trim()));
			
			ar.add(dto);	
		}
		return ar;
		
	}
	
}
