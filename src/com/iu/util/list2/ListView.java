package com.iu.util.list2;

import java.util.ArrayList;

public class ListView {
	
	public void view(ArrayList list) {
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================");
	}
	
}
