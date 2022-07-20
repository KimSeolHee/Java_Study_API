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
		
		for(CityDTO arr:ar) {
			System.out.println("이름: "+ arr.getName());
			System.out.println("기온: "+ arr.getGion());
			System.out.println("?: "+ arr.getHum());
			System.out.println("상태: "+ arr.getStatus());
		}
		
	}
	
	public void view(String[] city) {
		 
	}
	
	public void view(String messege) {
		
	}
}
