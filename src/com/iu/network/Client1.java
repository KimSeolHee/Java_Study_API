package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
	
	public void send() throws Exception {
		Scanner scanner= new Scanner(System.in);
		
		Socket socket = new Socket("192.168.7.20", 8282);
		System.out.println("Server 접속 완료");
		boolean check = true;
		while(check){		
			System.out.println("서버로 보낼 메세지 입력");
			String message = scanner.next();
			
			OutputStream os = socket.getOutputStream();//0,1
			OutputStreamWriter ow = new OutputStreamWriter(os);//문자한글자
			BufferedWriter bw = new BufferedWriter(ow);//문자연결
			
			//전송
			bw.write(message+"\r\n");
			bw.flush();
			
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			message = br.readLine();
			System.out.println("Server : "+ message.toLowerCase());
			
			if(message.toLowerCase().equals("q")) {
				//자원해제
				bw.close();
				ow.close();
				os.close();
				
				br.close();
				ir.close();
				is.close();
				socket.close();
				check = !check;
				break;
			}
			
		}
	}

}
