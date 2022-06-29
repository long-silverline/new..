package co.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WritercharOff {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("filewriter.txt");
			char [] cbuf = "�ڹٴ� Ŀ����".toCharArray();
			writer.write(cbuf, 0, 2);
			writer.flush();
			System.out.println("���� ��");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
		}
		}
}
