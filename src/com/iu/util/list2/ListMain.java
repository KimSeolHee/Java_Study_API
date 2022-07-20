package com.iu.util.list2;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//1,2,3
		int [] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
		//1.List → ArrayList
		ArrayList list = new ArrayList();

		//object타입만 들어가는데 primitive타입이 들어가는이유!
		//int타입이 자동으로 Integer타입으로 바뀌면서 들어감autoBoxing
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(0);
		list.add(1, "abc"); // 타입이 다르지만 들어간다. Object타입을 모으려는 것이기때문
		list.add(7, "a");
		
		ListView listView = new ListView();
		listView.view(list);
		
		//remove - 특정 인덱스 번호의 요소를 삭제
		list.remove(2);
		list.remove("abc");
		listView.view(list);
		
		//set - 특정 인덱스 번호의 요소를 수정하자.
		list.set(1, 'c');
		listView.view(list);
		
		//clear - 모든 요소를 삭제
		list.clear();
		listView.view(list);
		System.out.println(list.size());
		
	}

}
