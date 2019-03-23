package file;

import java.io.File;

public class TestFile {
	static long minSize = Integer.MAX_VALUE;
	static long maxSize = 0;
	
	static File minFile = null;
	static File maxFile = null;
	
	public static void main(String[] args) {

	
		File f = new File("c:\\windows");
		listFile(f);
		System.out.printf("最大的文件是%s，其大小是%d字节%n",maxFile.getAbsolutePath(),maxSize);
		System.out.printf("最小的文件是%s，其大小是%d字节%n",minFile.getAbsolutePath(),minSize);
	}
	
	public static void listFile(File file) {
		if(file.isFile()) {
			if(0 != file.length() && file.length() < minSize) {
				minSize = file.length();
				minFile = file;							
			}
			
			if(file.length() > maxSize) {
				maxSize = file.length();
				maxFile = file;				
			}
			return;
		}
		if(file.isDirectory()) {
			File[] fs = file.listFiles();
			
			if(null != fs)
			
			for(File f : fs) {
				listFile(f);
			}
		}
	}
		

	
}

