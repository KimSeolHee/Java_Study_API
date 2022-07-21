package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {

	//view메서드
	//WeatherView 리스트를 받아서 모든 정보를 출력하는 메서드
	//view메서드
	//city하나를 받아서 모든 정보 출력
	//view메서드
	//메세지하나를 받아서 출력
	
	public void view(ArrayList<CityDTO> ar) {
		
		for(int i = 0; i <ar.size();i++) {
			//모든가방
			CityDTO cityDTO = ar.get(i); //ex)인덱스0번 가방 1개 인덱스1번가방 1개 인덱스2번가방 1개 .... 리스트 크기만큼
			
			this.view(cityDTO);
		}
		
	}
	//가방하나
	public void view(CityDTO cityDTO) {
		 System.out.println("도시명 : " + cityDTO.getName());
		 System.out.println("기온 : " + cityDTO.getGion());
		 System.out.println("습도 : " + cityDTO.getHum());
		 System.out.println("상태 : " + cityDTO.getStatus());
		 System.out.println("===========================");
	}
	
	public void view(String messege) {
		System.out.println(messege);
	}
}
