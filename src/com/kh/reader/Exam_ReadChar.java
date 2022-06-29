package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;		// Reader reader = new FileReader();로 써도 되는데 왜 나눠써요!?
									// 이거 없으면 28열에서 에러남 왠진 모름 28
		
		try {
			reader = new FileReader("filereader.txt");
			int readCharNo;				// 읽은 갯수를 저장하는 변수
			char[]cbuf = new char[2];	//읽은 문자를 저장하는 배열
			String data = "";
			while((readCharNo = reader.read(cbuf)) != -1) {
				data += new String(cbuf, 0, readCharNo); // 문자배열의 문자를 문자열로 바꾸는 과정
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
