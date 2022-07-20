package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	Scanner sc;
	WeatherService service;
	WeatherView view;
	
	public WeatherController() {
		sc = new Scanner(System.in);
		service = new WeatherService();
		view = new WeatherView();
	}
	//WeatherController
	//start메서드 하나
	//1.번누르면 도시정보 초기화 - init메서드
	//2. 전국날씨 출력
	//3. 지역날씨 검색 도시명검색해서 해당도시 날씨찍기 find
	//4. 지역정보 추가
	//5. 지역정보 삭제
	//6. 종료
	
	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<CityDTO>();
		System.out.println("1.도시정보초기화 2.전국날씨 3.지역날씨검색 4.지역정보추가 5.도시정보삭제");
		int choice = sc.nextInt();
		
		//1번
		if(choice == 1) {
			service.init(ar);
		}
		
		//2번
		if(choice == 2) {
			view.view(ar);
		}
		
		//3번
		if(choice == 3) {
//			service.find();
		}
		
		if(choice == 4) {
			service.add(ar);
		}
		
		if(choice == 5) {
			service.remove(ar);
		}
	}

}
