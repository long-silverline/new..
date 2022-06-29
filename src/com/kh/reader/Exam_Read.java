package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.imageio.IIOException;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is =null; // 바이트 기반 스트림의 조상 클래스
		Reader reader = null; // 문자기반 스트림의 조상 클래스, 이걸 사용!
		try {
			reader = new FileReader("filereader.txt");
			int readData; //읽은데이터 저정
//			while(true) {
//				readData = reader.read();
//				if(readData == -1 ) break; 
			while((readData =reader.read())!= -1) {
				System.out.print((char)readData);// 숫자가 나오나 문자로 출력해야함 방법은?
			}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					reader.close();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			
		}
	}
}

