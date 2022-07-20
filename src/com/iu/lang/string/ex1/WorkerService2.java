package com.iu.lang.string.ex1;

import java.util.StringTokenizer;

public class WorkerService2 {

	private StringBuffer sb;
	
	private String info;
	public WorkerService2() {
		sb= new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
	}
	//tokenizer사용
	public WorkerDTO [] init() {

		String info = sb.toString();
		String newInfo = info.replace(",", "-");
		StringTokenizer st = new StringTokenizer(newInfo,"- ");
		WorkerDTO [] workerDTOs = new WorkerDTO[st.countTokens()/4];
		
		int index = 0;
		while(st.hasMoreElements()) {
			WorkerDTO workerDTO = new WorkerDTO();
			
			workerDTO.setName(st.nextToken());
			workerDTO.setDepartment(st.nextToken());
			workerDTO.setJob(st.nextToken());
			workerDTO.setPhone(st.nextToken());
			
			workerDTOs[index] = workerDTO;
			index++;
		}
		
		
//		WorkerDTO [] workerDTOs = new WorkerDTO[infos.length/4];
//		
//		int index = 0;
//		for(int i = 0;i < infos.length;i++) {
//		
//			WorkerDTO workerDTO = new WorkerDTO();
//			workerDTO.setName(infos[i].trim()); //0,4,8
//			workerDTO.setDepartment(infos[++i].trim());//1,5,9
//			workerDTO.setJob(infos[++i].trim());//2,6,10
//			workerDTO.setPhone(infos[++i].trim());//3,7,11
//			
////			System.out.println(workerDTO.getName());
////			System.out.println(workerDTO.getDepartment());
////			System.out.println(workerDTO.getJob());
////			System.out.println(workerDTO.getPhone());
//			
//			workerDTOs[index] = workerDTO;
//			index++;
//		}
//	
		return workerDTOs;
	}
	
	
}
