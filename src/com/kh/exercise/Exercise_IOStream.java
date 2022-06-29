package com.kh.exercise;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Exercise_IOStream {
	/* ������ ���ϸ� �Է� : khtext.txt
	 * 'khtext.txt'���Ͽ� ����� ���� �Է� :
	 * ����� exit
	 * 1 : 1111
	 * 2 : text input
	 * 3 : good
	 * 4 : gogogo
	 * 5 : exit
	 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
	 */
	public static void main(String[] args) {
//		InputStream kh = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		System.out.println("������ ���ϸ� �Է� : ");
		String fileName = sc.next();
		sc.nextLine();
		try {
		    os= new FileOutputStream(fileName);
			System.out.println("'"+fileName+"' ���Ͽ� ����� ���� �Է� : ");
			System.out.println("����� exit");
			int lineNumber =1 ;
			while(true) {
				System.out.print(lineNumber++ +" : ");
				String input = sc.nextLine() + "\n";	//������ �ȵǴ� ������ �ذ��ϱ� ���ؼ��� ���? \n
				if(input.equals("exit\n")) break;		//�Է°��� input�δ� exit���� ���ϴ� ���ǽ��� ? 
				byte [] buf = input.getBytes();			//�Է¹��ڿ��� ����Ʈ �迭�� ��ȯ
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
