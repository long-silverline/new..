package com.kh.fileclass;

import java.io.File;

public class Exam_File2 {
	public static void main(String[] args) {
		//파일정보알아오기
		File inFile = new File ("inputStram.txt");
		File fileInfo = new File("src\\com\\kh\\exercise\\Exam_FileInputStream");
		
		System.out.println("파일명 : " + inFile.getName());
		System.out.println("파일용량 : " + inFile.length());
		System.out.println("상위폴더 : " + inFile.getParent());
		System.out.println("파일상대경로 : " + inFile.getPath());
		System.out.println("파일절대경로 : " + inFile.getAbsolutePath());
		System.out.println("파일 절대경로 : " + fileInfo.getAbsolutePath());
	}
}
