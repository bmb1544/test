package stream;

import java.io.*;

public class SearchFileContent_Demo {
	public static void main(String[] args) {
		search("d:/Practice","goose");
	}
	
	private static void search(String folderPath,String str) {

		
		
		File f = new File(folderPath);
		
		if(f.isDirectory()) {
		
			File[] fs = f.listFiles();
			for(File a : fs) {
			search(a.getAbsolutePath(),str);
			}
		}
		
		if(f.isFile()) {
			readContent(f,str);
			
		}
	}
		
	private static void readContent(File f,String str) {
		byte[] buffer = new byte[1024];
		
		try(FileInputStream fis =new FileInputStream(f)){
			
			while(true) {
				int actuallyRead = fis.read(buffer);
				if(-1 == actuallyRead )
					break;
				
				String content = new String(buffer);
//				System.out.println("111");
				if(content.contains(str)) {
					System.out.printf("找到目标字符串%s,在文件：%s%n",str,f.getAbsolutePath());
					break;
				}	
			}
			
		}catch(IOException e) {
			e.printStackTrace();
//			return null;
		}
		
	}	
		

}
