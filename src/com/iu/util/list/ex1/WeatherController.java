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
		boolean check = true;
		
		while(check) {
			System.out.println("1.도시정보초기화 2.전국날씨 3.지역날씨검색 4.지역정보추가 5.도시정보삭제 6.종	료");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				service.init(ar);
			}else if(choice == 2) {
				view.view(ar);
			}else if(choice == 3) {
//				service.find();
			}else if(choice == 4) {
				service.add(ar);
			}else if(choice == 5) {
				service.remove(ar);
				//view.view(message)
			}else {
				System.out.println("프로그램 종료");
				check = !check;
				break;
			}
			
		}

	}

}
