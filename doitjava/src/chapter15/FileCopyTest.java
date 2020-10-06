package chapter15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long ms = 0;
		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			ms = System.currentTimeMillis();
			int i;
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
			ms = System.currentTimeMillis() - ms;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����ϴµ� " + ms + " milliseconds �ҿ�Ǿ����ϴ�.");
	}
}
