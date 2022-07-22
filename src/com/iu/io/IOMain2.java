package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain2 {

	public static void main(String[] args) {
		InputStream is = System.in; //0과 1만 처리한다
		InputStreamReader ir= new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("입력");
		
		try {
			String message = br.readLine();
			System.out.println(message);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//연결된 역순으로 자원을 해제 하세요.
			try {
				br.close();				
				ir.close();
				is.close();
			}catch(Exception e) {
				
			}
		}
	}

}
