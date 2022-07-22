package com.iu.io.file;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadMain {
	
	public static void main(String[] args) {
		FileRead fr = new FileRead();
		FileWrite fw = new FileWrite();
		try {
			fr.read();
			fw.write();
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
