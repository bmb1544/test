package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class MurgeFileDemo {
	
	public static void main(String[] args) {
		murgeFile("d:/","eclipse.exe");
	}
	
	/**
     * 合并的思路，就是从eclipse.exe-0开始，读取到一个文件，就开始写出到 eclipse.exe中，直到没有文件可以读
     * @param folder
     *            需要合并的文件所处于的目录
     * @param fileName
     *            需要合并的文件的名称
     * @throws FileNotFoundException
     */
	
	private static void murgeFile(String folder,String fileName) {
		File destFile = new File(folder,fileName);
		try(FileOutputStream fos = new FileOutputStream(destFile)) {
			//合并的目标文件
			int index = 0;
			while(true) {
				//子文件
				File eachFile = new File(folder,fileName + "-" + index++);
				//如果子文件不存在则结束
				if(!eachFile.exists())
					break;
				
				//读取子文件内容
				try(FileInputStream fis = new FileInputStream(eachFile)){
					byte[] eachContent = new byte[(int)eachFile.length()];
					fis.read(eachContent);
					fis.close();
				
					//把子文件内容写进去
					fos.write(eachContent);
					fos.flush();
					System.out.printf("把子文件%s写到目标文件中去%n",eachFile);
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
			}	
			
			System.out.printf("最后目标文件%s 的大小为%d ",destFile,destFile.length());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
