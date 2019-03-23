package stream;

import java.io.*;

public class CopyFile_Demo {

	public static void main(String[] args) {
		
		copyFile("d:/lol2.txt","d:/lol.txt");
		
	}
		
	public static void copyFile(String srcFile, String destFile){
		//��Դ�ļ�����
		File src = new File(srcFile);
		File dest = new File(destFile);
		
//		System.out.println(src);
//		System.out.println(src.getAbsolutePath());    ���仰һ��
		
		//׼��һ��1kb�Ļ�����
		byte[] buffer = new byte[1024];
		
		try(FileInputStream fr = new FileInputStream(src);FileOutputStream fw = new FileOutputStream(dest)){
			
			while(true) {
			int actullyRead = fr.read(buffer);
			if(-1 == actullyRead)
				break;
			fw.write(buffer,0,actullyRead);
			}
			

			
		}catch (IOException e) {
			e.printStackTrace();
		}
		

		
	}
}
