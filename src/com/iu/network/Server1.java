package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	
	public void receive() throws Exception {
		Scanner scanner= new Scanner(System.in);
		
		ServerSocket serverSocket = new ServerSocket(8282);
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는 중");
		//socket : 상대방과 1:1 통신
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		boolean check = true;
		while(check){
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			String message = br.readLine();
			System.out.println("Client : "+ message.toLowerCase());
			
			System.out.println("클라이언트로 보낼 메세지 입력");
			message = scanner.next();
			OutputStream os = socket.getOutputStream();//0,1
			OutputStreamWriter ow = new OutputStreamWriter(os);//문자한글자
			BufferedWriter bw = new BufferedWriter(ow);//문자연결
			
			//전송
			bw.write(message+"\r\n");
			bw.flush();	
			if(message.toLowerCase().equals("q")) {
				//자원해제
				br.close();
				ir.close();
				is.close();
				
				os.close();
				ow.close();
				bw.close();
				
				socket.close();
				serverSocket.close();
				check =!check;
				break;
			}
		}
	}
}
