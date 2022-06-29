package com.kh.exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream_writer {
	public static void main(String[] args) {
		/*
		 * ������ ���ϸ� �Է� : khtext.txt
		 * 'khtext.txt'' ���Ͽ� ����� ���� �Է� :
		 * ����� exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		//OutputStream os = null;
		Writer writer = null;
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.next();
		sc.nextLine();
		
		try {
			//os = new FileOutputStream(fileName);
			writer = new FileWriter(fileName);
			System.out.println("'"+fileName+"' ���Ͽ� ����� ���� �Է� : ");
			System.out.println("����� exit");
			int lineNumber = 1;
			while(true) {
				System.out.print(lineNumber++ + " : ");
				//lineNumber++;
				String input = sc.nextLine() + "\n";		// ������ �ȵǴ� ������ �ذ��ϱ� ���ؼ� ���?? \n �߰�
				if(input.equals("exit\n")) break;			// �Է°��� input�� exit���� ���ϴ� ���ǽ���? ���ڿ��񱳴� equals
				//byte [] buf = input.getBytes();		// �Է� ���ڿ��� ����Ʈ �迭�� ��ȯ
				//os.write(buf);						// �ش� ���Ͽ� ���ڿ� ����
				writer.write(input);
			}
			//os.flush();
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//os.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
