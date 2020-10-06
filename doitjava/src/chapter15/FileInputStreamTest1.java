package chapter15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileReader fis = null;

		try {
			fis = new FileReader("C:\\Users\\java10\\git\\doitjava\\doitjava\\src\\chapter15\\input.txt");
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
			int word;
			while ((word = fis.read()) != -1) {
				System.out.print((char) word);
			} System.out.println();
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("그거");
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				System.out.println(e);
				System.out.println("저거");
			} catch (NullPointerException e) {
				System.out.println(e);
				System.out.println("이거");
			}
		}
		System.out.println("end");
	}
}
