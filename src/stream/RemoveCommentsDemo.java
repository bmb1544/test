package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class RemoveCommentsDemo {
	public static void main(String[] args) {		
		File f = new File("d:/remove.txt");		
		System.out.println(f.exists());
	    System.out.println(f.length());
	    removeComments(f);
	}
	
	private static void removeComments(File javaFile) {
		StringBuffer sb = new StringBuffer();
		
		try(FileReader fr = new FileReader(javaFile);BufferedReader br = new BufferedReader(fr))
		{
			while(true) {
				String line = br.readLine();
				//结束检查
				if(null == line)
					break;
				//如果不是//开头则不保存
				if(!line.trim().startsWith("//"))
					sb.append(line).append("\r\n");
					
			}
			 
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileWriter fw = new FileWriter(javaFile);PrintWriter pw = new PrintWriter(fw)){
			
			pw.println(sb.toString());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
