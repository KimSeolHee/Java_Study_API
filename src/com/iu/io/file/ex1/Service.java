package com.iu.io.file.ex1;

import java.util.ArrayList;

public interface Service {
	//StudentDAO에서 getList를 호출하고 총점과 평균을 각각
	//계산해서 대입하고 그 List를 리턴
	public ArrayList<StudentDTO> getList() throws Exception;

	//StudentDAO의 setList를 호출하고 
	//그결과 리턴
	public int setList(ArrayList<StudentDTO> ar)throws Exception;
	
	//학생한명을 찾는다.찾으려고 하는 학생의 번호를 입력받아서
	//찾은 학생을 리턴
	public StudentDTO getStudent(ArrayList<StudentDTO> ar)throws Exception;
	
	public int setStudentDelete(ArrayList<StudentDTO> ar)throws Exception;
	//삭제하려는 학생의 번호를 입력받아서 일치하는 학생을 삭제한다.
	//삭제가 성공하면 1을리턴
	//실패하거나 못찾는 경우.. 0을리턴한다.
	
	public void setStudentAdd(ArrayList<StudentDTO> ar)throws Exception;
	//학생추가
	//이름 번호 국어영어수학 입력받아서 학생한명추가하여
	//그냥 추가.
	
}
