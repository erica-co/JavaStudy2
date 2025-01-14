package com.winter.app.io;

import java.io.File;

public class IoMain2 {

	public static void main(String[] args) {
		File file = new File("C:\\test2");
		
		boolean check = file.exists();
		System.out.println(check);
		
		check = file.isDirectory();
		check = file.isFile();
		System.out.println(check);
		
		File file2 = new File(file, "study1");
		if (!file2.exists()) {
			file2.mkdir();
		}
		
		File file3 = new File(file, "Study1");
		file3.delete();
		
		
		
		
		
	}

}
