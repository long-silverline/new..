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
		 * 저장할 파일명 입력 : khtext.txt
		 * 'khtext.txt'' 파일에 저장될 내용 입력 :
		 * 종료는 exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * 파일 저장 완료 (exit는 제외하고 저장)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		//OutputStream os = null;
		Writer writer = null;
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.next();
		sc.nextLine();
		
		try {
			//os = new FileOutputStream(fileName);
			writer = new FileWriter(fileName);
			System.out.println("'"+fileName+"' 파일에 저장될 내용 입력 : ");
			System.out.println("종료는 exit");
			int lineNumber = 1;
			while(true) {
				System.out.print(lineNumber++ + " : ");
				//lineNumber++;
				String input = sc.nextLine() + "\n";		// 개행이 안되는 문제를 해결하기 위해서 어떻게?? \n 추가
				if(input.equals("exit\n")) break;			// 입력값인 input이 exit인지 비교하는 조건식은? 문자열비교는 equals
				//byte [] buf = input.getBytes();		// 입력 문자열을 바이트 배열로 변환
				//os.write(buf);						// 해당 파일에 문자열 쓰기
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
