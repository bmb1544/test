package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {
	public static void main(String[] args) {
		
		File f = new File("d:/LOL.exe");
		
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("�ɹ���");
		}
		
		catch(FileNotFoundException e) {
			System.out.println("d:/LOL.exe������");
			e.printStackTrace();
		}
		finally {
			System.out.println("�����ļ��Ƿ���ڣ�����ִ���������");
		}
		
	}
}
