package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);
	
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
		str = str.replace("-", ",");
		
		StringTokenizer token = new StringTokenizer(str, ",");
		
		while(token.hasMoreTokens()) {
			CityDTO dto = new CityDTO();

			dto.setName(token.nextToken());
			dto.setGion(Double.parseDouble(token.nextToken()));
			dto.setHum(Integer.parseInt(token.nextToken()));
			dto.setStatus(token.nextToken());
			
			ar.add(dto);
		}
	}
	
	public void add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시명입력");
		cityDTO.setName(sc.next());
		System.out.println("기온입력");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("습도입력");
		cityDTO.setHum(sc.nextInt());
		System.out.println("상태입력");
		cityDTO.setStatus(sc.next());
		
		ar.add(cityDTO);
	}
	
	//remove메서드
	//도시명을 입력받아서 리스트에서 삭제
	
	public void remove(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		
		String name = sc.next();//서울
		for(int i = 0;i < ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				ar.remove(i); //ar[i]의 요소를 삭제
				break;
			}
		}
		
		//향상된 for
//		for(CityDTO cityDTO: ar) {
//			if(name.equals(cityDTO.getName())) {
//				ar.remove(cityDTO);
//				break;
//			}
//		}
	}
	
	//find
	//도시명을 입력받아서 리스트에서 검색 없을때도 없다고 리턴해주기
	
	public CityDTO find(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시를 검색하세요.");
		String name = sc.next();
		
		CityDTO searchCity = null;
		for(int i = 0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				searchCity = ar.get(i);
			} else {
				System.out.println("없습니다.");
			}
		}
		return searchCity;
	}
	
	
	

}
