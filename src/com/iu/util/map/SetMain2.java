package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetMain2 {

	public static void main(String[] args) {
		//Random
		//1~45 중복되지않는 숫자 set에 담아서 출력
		Random random = new Random();
		
		HashSet<Integer> set = new HashSet<>();
		
		while(set.size() != 6) {
			int num = random.nextInt(45)+1;
			set.add(num);
		}

		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println(set);
		
//		System.out.println(set.size());

	}

}
