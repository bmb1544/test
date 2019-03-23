package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedWriter_Test {
	public static void main(String[] args) {
		File f = new File("d:/lol2.txt");
		
		try(
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			)
		{
			pw.println("111");
			pw.println("22222");
			pw.println("33333333");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
