package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;		// Reader reader = new FileReader();�� �ᵵ �Ǵµ� �� �������!?
									// �̰� ������ 28������ ������ ���� �� 28
		
		try {
			reader = new FileReader("filereader.txt");
			int readCharNo;				// ���� ������ �����ϴ� ����
			char[]cbuf = new char[2];	//���� ���ڸ� �����ϴ� �迭
			String data = "";
			while((readCharNo = reader.read(cbuf)) != -1) {
				data += new String(cbuf, 0, readCharNo); // ���ڹ迭�� ���ڸ� ���ڿ��� �ٲٴ� ����
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
