package stream;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SplitDigitDemo {
	static int x = 13;
	static int y = 14;
	static File f = new File("d:/lol.txt");
	
	public static void main(String[] args) {
		method1();
		method2();
	}
	
	private static void method1() {
		try(
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);
				FileOutputStream fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);
				)
		{
			dos.writeInt(x);
			dos.writeInt(y);
			
			int x = dis.readInt();
			int y = dis.readInt();
			
			System.out.printf("使用数据流读出来的x是%d  y是%d %n  ",x,y);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void method2() {
		try(
				FileWriter fw = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fw);
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
				)
		{
			pw.println(x + "@" + y);
			pw.flush();
			while(true) {
				String line = br.readLine();
				if(null == line)
					break;
				String[] ss = line.split("@");
				int x = Integer.parseInt(ss[0]);
				int y = Integer.parseInt(ss[1]);
				System.out.printf("使用数据流读出来的x是%d  y是%d %n  ",x,y);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
