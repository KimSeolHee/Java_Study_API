package com.iu.io.file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain {
	
	public static void main(String[] args) {
		FileRead fr = new FileRead();
		try {
			fr.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
