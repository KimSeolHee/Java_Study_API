package com.iu.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	
	public void write() throws Exception {
		File file = new File("C:\\Study","test.txt");
		FileWriter fw = new FileWriter(file, false);
		
		fw.write("today new String\r\n");
//		fw.flush();
		
		fw.write("내일은 토요일\r\n");
		fw.flush();
	}

}
