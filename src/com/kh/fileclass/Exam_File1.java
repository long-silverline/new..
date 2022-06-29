package com.kh.fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam_File1 {
	public static void main(String[] args) {
		/*
		1. 파일 생성
		2. 폴더 생성
		3. 파일 존재 여부 확인
		4. 파일 여부 확인
		*/
		makeFileInDirectory();
		makeDirectory();
		makeFile();
	}
	static void makeFileInDirectory() {
		File file= new File("C:\\Users\\user\\OneDrive\\바탕 화면\\KH\\D\\tmp\\khtext.txt");
		try {
			file.createNewFile();
			System.out.println("파일이 존재하는가 : " + file.exists());
			System.out.println("khtext.txt가 파일이 맞는가? : "+ file.isFile());
			//파일 삭제
			if(file.delete()) System.out.println("파일이 삭제 되었습니다");
			System.out.println("파일이 존재하는가? : "  +file.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	static void makeDirectory() {
		File file = new File("C:\\Users\\user\\OneDrive\\바탕 화면\\KH\\D\\khstep1\\khstep2\\khstep3\\");
		file.mkdir();
		System.out.println("khstep3이 폴더가 맞는가? : " + !file.isFile());
	}
	static void makeFile() {
		File file = new File("khfile.txt");
		// FileOutputStream > write() 파일에 내용쓰기
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
}
