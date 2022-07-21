package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	//결합도가 강하다(높다) : 자체에서 객체생성
	//결합도가 느슨하다(낮다) : 매개변수를 통해서 만들어진 객체를 주입
	//					: 생성자의 매개변수
	
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
				CityDTO cityDTO = service.find(ar);
				if(cityDTO != null) {
					view.view(cityDTO);
				}else {
					view.view("검색한 도시가 없습니다.");
				}
				
//				for(int i= 0;i<ar.size();i++) {
//					if(cityDTO == ar.get(i)) {
//						view.view(cityDTO);
//					}
//				}
//				if(cityDTO ==null) {
//					System.out.println("검색한 도시가 없습니다.");
//				}
			}else if(choice == 4) {
				view.view("지역정보를 추가하세요.");
				boolean result = service.add(ar);
				String message = "추가 실패";
				if(result) {
					message="추가 성공";
				}
				view.view(message);
				
			}else if(choice == 5) {
				boolean result = service.remove(ar);
				String message = "삭제 실패";
				if(result) {
					message="삭제 성공";
				}
				view.view(message);
			}else {
				view.view("프로그램 종료");
				check = !check;
				break;
			}
			
		}

	}

}
