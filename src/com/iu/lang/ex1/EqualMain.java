package com.iu.lang.ex1;

public class EqualMain {

	public static void main(String[] args) {
		
		Phon p1 = new Phon();
		p1.setPrice(100);
		p1.setSize(50);
		
		Phon p2 = new Phon();
		p2.setPrice(100);
		p2.setSize(50);
		
		System.out.println(p1 == p2);
		System.out.println(p2.equals(p1));
	}

}
