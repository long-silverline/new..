package co.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterChar {
	public void main(String [] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("filewriter.txt");
			char[] data = "�̰��� �ڹ���".toCharArray();
			writer.write(data);			//for���� ������� �ʾƵ� ��
			writer.flush();
			System.out.println(" write (char [])�޼ҵ� ���� �Ϸ�! "); //���Ȯ�ο� �޽���
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}