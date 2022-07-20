package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	Scanner sc = new Scanner(System.in);
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
//		String choice = sc.next();
		
		WeatherService service = new WeatherService();
		service.init(ar);
		//1번
		WeatherView view = new WeatherView();
		view.view(ar);
		
		//2번
		
		//3번
		
	}

}
