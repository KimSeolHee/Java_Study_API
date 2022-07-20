package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	
	public WeatherService() {		
		//도시명 검색,삭제는 소문자 대문자 구분없이
		
		//init메서드
		//sb에 있는 Data들을 파싱해서 cityDTO에 담아서 리턴
		
		//add메서드
		//city정보를 입력받아서 추가(도시명 기온 습도 상태)
		
		//remove메서드
		//도시명을 입력받아서 리스트에서 삭제
		
		//find
		//도시명을 입력받아서 리스트에서 검색 없을때도 없다고 리턴해주기
			
		sb = new StringBuffer();
		sb.append("Seol, 30.2,70,맑음,");
		sb.append("Deagu-38.9-90-흐림-");
		sb.append("jeju,12.1,10,눈,");
		sb.append("Busan-0.5-85-태풍");
		
	}
	//init메서드
	//sb에 있는 Data들을 파싱해서 cityDTO에 담아서 리턴
	int index = 0;
	public void init(ArrayList<CityDTO> ar) {
		String str = sb.toString();
		String result = str.replace(",", "-");
		System.out.println(result);
		
		String[] arr = result.split("-");
		for(int i = 0; i < arr.length;i++) {
			CityDTO dto = new CityDTO();

			dto.setName(arr[i].trim());
			dto.setHum(Integer.parseInt(arr[i].trim()));
			dto.setGion(Double.parseDouble(arr[i].trim()));
			dto.setStatus(arr[i].trim());
			
			ar.add(dto);
		}	
	}

}
