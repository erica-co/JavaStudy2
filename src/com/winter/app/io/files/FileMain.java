package com.winter.app.io.files;

import java.util.List;

import com.winter.app.io.FileOutput;

public class FileMain {

	public static void main(String[] args) {
//			FileOutput fileOutput = new FileOutput();
//			fileOutput.write();
		
		FileInput fileInput = new FileInput();
		try {
			List<Weather> ar=fileInput.input();
			for(Weather weather: ar) {
				weather.info();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		
	}

}
