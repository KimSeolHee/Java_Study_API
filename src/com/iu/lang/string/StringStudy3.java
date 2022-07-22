package com.iu.lang.string;

public class StringStudy3 {
	
	public void studySplit() {		
		
		//두가지 모두 String의 객체를 만드는 방법!
		String str = "설희, 혜림, 혜현, 형규";
//		String str2 = new String("");
		
		String [] names = str.split(", ");//
		
		//for → for(초기식;조건식;증감식){}
		//향상된 for문 for(배열에모은데이터타입 변수명: 배열참조배열명){}
		
//		for(int i=0;i<names.length;i++) {
//			String name = names[i];
//		}
		
		for(String name: names) {
			System.out.println(name);
		}
	}
	
	public void studySplit2() {
		String info="1997 12 24";
		
		String [] datas = info.split(" ");
		
		for(String data: datas) {
			System.out.println(data);
		}
	}
	
	public void studySplit3() {
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		
		String data = info.replace(",", "-");
		System.out.println(data);
		System.out.println("-------------------------------------");
		
		String [] citys =  data.split("-");
		
		for(String city:citys) {
			System.out.println(city);
		}
		
	}

}
