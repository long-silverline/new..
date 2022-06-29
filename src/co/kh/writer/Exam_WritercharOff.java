package co.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WritercharOff {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("filewriter.txt");
			char [] cbuf = "자바는 커피임".toCharArray();
			writer.write(cbuf, 0, 2);
			writer.flush();
			System.out.println("쓰기 완");
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
