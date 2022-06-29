package com.kh.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String[] args) {
		// �̹��� ����
		// ������ ��δ� dd\\temp\\\\xxx.png
		// ������ ���� �� ���� ���� ����
		// ������ ��δ� copid
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\user\\OneDrive\\���� ȭ��\\KH\\D\\tmp\\dev_corp.png");
			//�̹��� ���ϵ� ������ ������ ���̳ʸ� �ڵ�(���� ������)�� �Ǿ��ְ�
			//�ش� ������ ����Ʈ �迭�� �а� �Ǹ� ���簡 ��������
		    os = new FileOutputStream("C:\\Users\\user\\OneDrive\\���� ȭ��\\KH\\copied.png");
			int readByteNo;
			byte [] readBytes = new byte[100];
			while ((readByteNo = is.read(readBytes))!= -1) {
					// ���� �ڵ尡 �ʿ���
				os.write(readBytes, 0, readByteNo);// �о�� �����͸� C:\\Users\\user\\OneDrive\\���� ȭ��\\KH\\copied.png ���Ͽ� ��
			}
			os.flush();
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
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
