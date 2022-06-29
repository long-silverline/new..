package com.kh.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String[] args) {
		// 이미지 복사
		// 파일의 경로는 dd\\temp\\\\xxx.png
		// 파일을 읽은 후 읽은 값을 쓰기
		// 복사할 경로는 copid
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\user\\OneDrive\\바탕 화면\\KH\\D\\tmp\\dev_corp.png");
			//이미지 파일도 어차피 저장은 바이너리 코드(이진 데이터)로 되어있고
			//해당 파일을 바이트 배열로 읽게 되면 복사가 가능해짐
		    os = new FileOutputStream("C:\\Users\\user\\OneDrive\\바탕 화면\\KH\\copied.png");
			int readByteNo;
			byte [] readBytes = new byte[100];
			while ((readByteNo = is.read(readBytes))!= -1) {
					// 쓰기 코드가 필요함
				os.write(readBytes, 0, readByteNo);// 읽어온 데이터를 C:\\Users\\user\\OneDrive\\바탕 화면\\KH\\copied.png 파일에 씀
			}
			os.flush();
			System.out.println("복사가 완료되었습니다.");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
				}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
