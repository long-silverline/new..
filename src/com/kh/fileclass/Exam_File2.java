package com.kh.fileclass;

import java.io.File;

public class Exam_File2 {
	public static void main(String[] args) {
		//���������˾ƿ���
		File inFile = new File ("inputStram.txt");
		File fileInfo = new File("src\\com\\kh\\exercise\\Exam_FileInputStream");
		
		System.out.println("���ϸ� : " + inFile.getName());
		System.out.println("���Ͽ뷮 : " + inFile.length());
		System.out.println("�������� : " + inFile.getParent());
		System.out.println("���ϻ���� : " + inFile.getPath());
		System.out.println("���������� : " + inFile.getAbsolutePath());
		System.out.println("���� ������ : " + fileInfo.getAbsolutePath());
	}
}
