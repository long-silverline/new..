package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.imageio.IIOException;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is =null; // ����Ʈ ��� ��Ʈ���� ���� Ŭ����
		Reader reader = null; // ���ڱ�� ��Ʈ���� ���� Ŭ����, �̰� ���!
		try {
			reader = new FileReader("filereader.txt");
			int readData; //���������� ����
//			while(true) {
//				readData = reader.read();
//				if(readData == -1 ) break; 
			while((readData =reader.read())!= -1) {
				System.out.print((char)readData);// ���ڰ� ������ ���ڷ� ����ؾ��� �����?
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

