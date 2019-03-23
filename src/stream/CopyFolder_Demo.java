package stream;

import java.io.*;

public class CopyFolder_Demo {//extends CopyFile_Demo{  //�̳���CopyFile_Demo�������������ķ���

	public static void main(String[] args) {
		copyFolder("d:/javaTest", "d:/javaTest2");
	}

	
	public static void copyFolder(String srcPath, String destPath){
		File srcFolder = new File(srcPath);
		File destFolder = new File(destPath);
		
		//�ж�Դ�ļ����Ƿ����
		if(!srcFolder.exists())
			return;
		//�ж�Դ�ļ����Ƿ�Ϊ�ļ���
		if(!srcFolder.isDirectory())
			return;
		//�ж�Ŀ���ļ����Ƿ�Ϊ�ļ�
		if(destFolder.isFile())
		//if(!destFolder.isDirectory())  
			return;
		//�ж�Ŀ���ļ����Ƿ����
		if(!destFolder.exists())
			destFolder.mkdirs();
		
		//����Դ�ļ���
		File fs[] = srcFolder.listFiles();
		for(File srcFile : fs) {
			//������ļ�������
			if(srcFile.isFile()) {
				File newDestFile = new File(destPath/*destFolder*/,srcFile.getName());
				
				CopyFile_Demo.copyFile(srcFile.getAbsolutePath(), newDestFile.getAbsolutePath());
			}
			
			if(srcFile.isDirectory()) {
				File newDestFolder = new File(destPath/*destFolder*/,srcFile.getName()/*getPath()*/);
				
				System.out.println(srcFile.getPath());
				System.out.println("****************");   //�ֱ��getPath��getName������
				System.out.println(srcFile.getName());
				System.out.printf("%n%n");
				
				copyFolder(srcFile.getAbsolutePath(), newDestFolder.getAbsolutePath());
			}
			
			
			
		}
		
		
	}
}
