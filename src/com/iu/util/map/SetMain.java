package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(10);
		hashSet.add(1);
		hashSet.add(10);
		
		//Set은 중복이 불가능하므로 2개가 있다.
		System.out.println(hashSet.size());
		
		Iterator<Integer> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
