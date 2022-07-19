package com.iu.lang.string.ex1;

public class WorkerService {

	private StringBuffer sb;
	
	private String info;
	public WorkerService() {
		sb= new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
	}
	
	public WorkerDTO [] init() {
		//info에 있는 데이터를 parsing해서 workerDTO에 대입하고 
		//WorkerDTO를 모은 배열을 리턴
		String info = sb.toString();
		String newInfo = info.replace(",", "-");
		
		String [] infos = newInfo.split("-");
		
		WorkerDTO [] workerDTOs = new WorkerDTO[infos.length/4];
		
		int index = 0;
		for(int i = 0;i < infos.length;i++) {
		
			WorkerDTO workerDTO = new WorkerDTO();
			workerDTO.setName(infos[i].trim()); //0,4,8
			workerDTO.setDepartment(infos[++i].trim());//1,5,9
			workerDTO.setJob(infos[++i].trim());//2,6,10
			workerDTO.setPhone(infos[++i].trim());//3,7,11
			
//			System.out.println(workerDTO.getName());
//			System.out.println(workerDTO.getDepartment());
//			System.out.println(workerDTO.getJob());
//			System.out.println(workerDTO.getPhone());
			
			workerDTOs[index] = workerDTO;
			index++;
			
		}
	
		return workerDTOs;
	}
	
	
}
