package com.iu.exception;

public class ExceptionMain {

	public static void main(String[] args) throws MyException, Exception {
		System.out.println("메인 시작");
		Test test = new Test();
//		test.t1();
//		test.t2();
//		try {
//			test.t3();			
//		}catch(Throwable e) {
//			e.printStackTrace();
//			System.out.println("오류 해결");
//		}finally {
//			System.out.println("무조건 실행");
//		}
		
		test.t4();
		System.out.println("메인 종료");
	}

}
