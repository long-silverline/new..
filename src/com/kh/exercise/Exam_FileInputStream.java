package com.kh.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;



public class Exam_FileInputStream {
	public static void main(String[] args) {
		// Exam_FileInputStream.java 파일을 읽어 들여서 console창에 출력해보세요
		InputStream is = null;	
		try {
			is = new FileInputStream("C:\\Users\\user\\OneDrive\\바탕 화면\\KH\\D\\2022_06_dev\\D13_IOStream\\src\\com\\kh\\exercise\\Exam_FileInputStream.java");
			int dataByteNo;
			byte [] buf = new byte[100];
			String result = "";
			while((dataByteNo = is.read (buf))!= -1) {
				result += new String (buf, 0 , dataByteNo);
			}
			System.out.print(result);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
