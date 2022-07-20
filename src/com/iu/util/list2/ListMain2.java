package com.iu.util.list2;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListView listView = new ListView();
		
		ArrayList<String> ar = new ArrayList<>();
										  //↑생략가능
		//다형성 때문이다.
		//모든 데이터는 Object타입이므로.. 다형성 때문입니다!
		ar.add("first");
//		ar.add(2);//Integer이란 클래스로 auto boxing되어 들어감
//		ar.add('c');//Character타입으로 auto boxing되어 들어감
//		ar.add(2.123);//Double타입으로 auto boxing되어 들어감
		ar.add(null);
		
		//배열은 같은 데이터 타입만 넣었다. 배열도 오브젝트타입만 모으게끔하면 가능하다...
		//List는 다른타입 데이터도 모으기 가능
		
		//꺼내는 메서드 get -> 특정인덱서의 요소를 반환 받으려고 함.
		String n1 = (String)ar.get(0);
		System.out.println(n1);
//		int n2 = (Integer)ar.get(1);
//		System.out.println(n2);
//		char n3 = (Character)ar.get(2);
//		System.out.println(n3);
//		double n4 = (Double)ar.get(3);
//		System.out.println(n4);
		
		
//		listView.view(ar);
		
		
		//primitive타입끼리는 형변환
		//다형성은 reference타입끼리 부모자식관계

	}

}
