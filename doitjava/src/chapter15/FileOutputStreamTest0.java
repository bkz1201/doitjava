package chapter15;

import java.io.FileOutputStream;

public class FileOutputStreamTest0 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a.zip");
			for (int i = 65; i < 65 + 26; i++) {
				fos.write((char) i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null)
				try {
					fos.close();					
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}
}
