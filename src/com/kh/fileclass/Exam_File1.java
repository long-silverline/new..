package com.kh.fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam_File1 {
	public static void main(String[] args) {
		/*
		1. ���� ����
		2. ���� ����
		3. ���� ���� ���� Ȯ��
		4. ���� ���� Ȯ��
		*/
		makeFileInDirectory();
		makeDirectory();
		makeFile();
	}
	static void makeFileInDirectory() {
		File file= new File("C:\\Users\\user\\OneDrive\\���� ȭ��\\KH\\D\\tmp\\khtext.txt");
		try {
			file.createNewFile();
			System.out.println("������ �����ϴ°� : " + file.exists());
			System.out.println("khtext.txt�� ������ �´°�? : "+ file.isFile());
			//���� ����
			if(file.delete()) System.out.println("������ ���� �Ǿ����ϴ�");
			System.out.println("������ �����ϴ°�? : "  +file.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	static void makeDirectory() {
		File file = new File("C:\\Users\\user\\OneDrive\\���� ȭ��\\KH\\D\\khstep1\\khstep2\\khstep3\\");
		file.mkdir();
		System.out.println("khstep3�� ������ �´°�? : " + !file.isFile());
	}
	static void makeFile() {
		File file = new File("khfile.txt");
		// FileOutputStream > write() ���Ͽ� ���뾲��
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
}
