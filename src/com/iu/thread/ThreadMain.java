package com.iu.thread;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadTest1 test = new ThreadTest1();
		ThreadTest2 test2 = new ThreadTest2();
		Thread t = new Thread(test2);
		
		//개발자가 직접 호출이 아니라
		//OS에게 실행 부탁을 해야한다.
		
		test.start();
//		test2.start();
		t.start();
		
//		test.getNum();
//		test2.getAlpa();

	}

}
