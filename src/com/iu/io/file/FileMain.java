package com.iu.io.file;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) {
		//File : 파일이나 폴더의 정보를 담고 있는 클래스
		//	   : 실제 파일이나 폴더가 없을수도 있음(없으면 없는 정보를 담고있음.)
		File file = new File("C:\\Study\\test.txt");//폴더명+파일명
		file = new File("C:\\Study", "test.txt"); //parent: 폴더, Child: 파일명 또는 최종 폴더명
		
		//1. 폴더명 경로가 있는 File 객체 이용
		File path = new File("C:\\study");
		file = new File(path, "test.txt");
		
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length());
		
		System.out.println("======================");
		System.out.println(path.exists());
		System.out.println(path.isFile());
		System.out.println(path.isDirectory());
		
		file = new File("C:\\Study\\sub");
		if(!file.exists()) {
			file.mkdir();
		}
		File file2 = new File("C:\\Study\\sub2\\t1");
//		file.mkdir(); 중간에 폴더가 없으면 생성X
		file2.mkdirs();
		
//		file.delete();
		
		file2.delete();
		File file3 = new File("C:\\Study\\sub2");
		
		//폴더를 지울땐 내부가 비어있어야 한다.
		file3.delete();
		
		
		
		
		
		
	}

}
