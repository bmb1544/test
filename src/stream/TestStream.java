package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.FileReader;

public class TestStream {
	public static void main(String[] args) {
		File f = new File("d:/lol2.txt");
		try(FileWriter fw = new FileWriter(f)){
			String data = "ABCDFFF";
			char[] all = data.toCharArray();
			fw.write(all);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}