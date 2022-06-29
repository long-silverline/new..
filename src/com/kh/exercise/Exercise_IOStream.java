package com.kh.exercise;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Exercise_IOStream {
	/* 저장할 파일명 입력 : khtext.txt
	 * 'khtext.txt'파일에 저장될 내용 입력 :
	 * 종료는 exit
	 * 1 : 1111
	 * 2 : text input
	 * 3 : good
	 * 4 : gogogo
	 * 5 : exit
	 * 파일 저장 완료 (exit는 제외하고 저장)
	 */
	public static void main(String[] args) {
//		InputStream kh = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		System.out.println("저장할 파일명 입력 : ");
		String fileName = sc.next();
		sc.nextLine();
		try {
		    os= new FileOutputStream(fileName);
			System.out.println("'"+fileName+"' 파일에 저장될 내용 입력 : ");
			System.out.println("종료는 exit");
			int lineNumber =1 ;
			while(true) {
				System.out.print(lineNumber++ +" : ");
				String input = sc.nextLine() + "\n";	//개행이 안되는 문제를 해결하기 위해서는 어떻게? \n
				if(input.equals("exit\n")) break;		//입력값이 input인다 exit인지 비교하는 조건식은 ? 
				byte [] buf = input.getBytes();			//입력문자열을 바이트 배열로 변환
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
