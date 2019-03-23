package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class BufferedReader_Test {
	public static void main(String[] args) {
		File f = new File("d:/lol.txt");
		
		try(
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			)
		{
			while(true) {
				String line = br.readLine();
				if(null == line)
					break;
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
