package com.iu.lang.ex1;

public class Phon {

	private int price;
	private int size;
	
	//equals 메서드 오버라이딩
	//각 멤버의 값이 같으면 true, 하나라도 틀리면 false리턴
	//힌트 : 참조변수 this
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		Phon phon = (Phon)obj;
//		this.getPrice() phon.getPrice() //this == p1
		boolean check = false;
		if(this.getPrice() == phon.getPrice() && this.getSize() == phon.getSize()) {
			check = !check;
		}
		return check;
	}
	
	
}
