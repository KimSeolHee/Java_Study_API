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
		String str = sb.toString(); //StringBuffer타입은 String 타입과는 다르기 때문에 to.String으로 바꿔준다!
		str = str.replace("-", ",");
		
		//String에서 split과 StringTokenizer에서 선택하는데 잘라서 여러개의 데이터가 하나의 데이터모음일 경우 tokenizer이 좋다!
		StringTokenizer token = new StringTokenizer(str, ",");
		
		//토큰들을 자른 길이만큼 돌리는데 한묶음을 하나의 리스트 요소에 집어넣는다. 
		while(token.hasMoreTokens()) {
			CityDTO dto = new CityDTO();

			dto.setName(token.nextToken());
			dto.setGion(Double.parseDouble(token.nextToken()));
			dto.setHum(Integer.parseInt(token.nextToken()));
			dto.setStatus(token.nextToken());
			
			ar.add(dto);
		}
	}
	
	public boolean add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시명입력");
		cityDTO.setName(sc.next());
		System.out.println("기온입력");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("습도입력");
		cityDTO.setHum(sc.nextInt());
		System.out.println("상태입력");
		cityDTO.setStatus(sc.next());
		
		return ar.add(cityDTO);
	}
	
	//remove메서드
	//도시명을 입력받아서 리스트에서 삭제
	
	public boolean remove(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("삭제할 도시명을 입력하세요.");
		String name = sc.next().toLowerCase();//서울
		//문자열을 같다 틀리다 == 으로 하면 XXXXXX 문자열은 equals로 내용을 비교한다.
		//ar.get(i).getName() >> ArrayList==ar에서 get(i)==CityDTO의 name을 삭제하자!
		boolean r = false;
		for(int i = 0;i < ar.size();i++) {
			if(name.equals(ar.get(i).getName().toLowerCase())) {
				ar.remove(i); //ar[i]의 요소를 삭제
				r = !r;
				break;
			}
		}
		
		return r;
		
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
//		CityDTO cityDTO = new CityDTO();
		System.out.println("도시를 검색하세요.");
		String name = sc.next().toLowerCase();
		
		CityDTO cityDTO = null;
		
		//향상된 for
		for(CityDTO city : ar) {
			if(name.equals(city.getName().toLowerCase())) {
				cityDTO = city;
				break;
			}
		}
		
//		for(int i = 0;i<ar.size();i++) {
//			if(name.equals(ar.get(i).getName())) {
//				cityDTO = ar.get(i);
//			} else {
//				System.out.println("없습니다.");
//			}
//		}
		
		return cityDTO;
	}
	
	
	

}
