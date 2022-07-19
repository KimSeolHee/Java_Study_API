package com.iu.lang.string.ex1;

public class WorkerDTO {
	
	//이름 부서명 직급 전화번호
	private String name;
	private String department;
	private String job;
	private String phone;
	
	//생성자는 기본 생성자 필수
	
	//Setter & Getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
