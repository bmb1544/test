package stream;

import java.io.*;

public class CopyFolder_Demo {//extends CopyFile_Demo{  //继承了CopyFile_Demo这个才能用里面的方法

	public static void main(String[] args) {
		copyFolder("d:/javaTest", "d:/javaTest2");
	}

	
	public static void copyFolder(String srcPath, String destPath){
		File srcFolder = new File(srcPath);
		File destFolder = new File(destPath);
		
		//判断源文件夹是否存在
		if(!srcFolder.exists())
			return;
		//判断源文件夹是否为文件夹
		if(!srcFolder.isDirectory())
			return;
		//判断目标文件夹是否为文件
		if(destFolder.isFile())
		//if(!destFolder.isDirectory())  
			return;
		//判断目标文件夹是否存在
		if(!destFolder.exists())
			destFolder.mkdirs();
		
		//遍历源文件夹
		File fs[] = srcFolder.listFiles();
		for(File srcFile : fs) {
			//如果是文件，则复制
			if(srcFile.isFile()) {
				File newDestFile = new File(destPath/*destFolder*/,srcFile.getName());
				
				CopyFile_Demo.copyFile(srcFile.getAbsolutePath(), newDestFile.getAbsolutePath());
			}
			
			if(srcFile.isDirectory()) {
				File newDestFolder = new File(destPath/*destFolder*/,srcFile.getName()/*getPath()*/);
				
				System.out.println(srcFile.getPath());
				System.out.println("****************");   //分辨出getPath和getName的区别
				System.out.println(srcFile.getName());
				System.out.printf("%n%n");
				
				copyFolder(srcFile.getAbsolutePath(), newDestFolder.getAbsolutePath());
			}
			
			
			
		}
		
		
	}
}
