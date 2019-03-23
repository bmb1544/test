package stream;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStream_Test {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("������������ƣ�");
		String className = s.nextLine();
		
		System.out.println("���������Ե����ͣ�");
		String type = s.nextLine();
		
		System.out.println("���������Ե����ƣ�");
		String name = s.nextLine();
		
		System.out.println("�滻������ݣ�");
		autoCreat(className,type,name);
	}
	
	private static void autoCreat(String className,String type,String name) {
		File f = new File("d:/"+className+".java");
		
		try(	FileWriter fw = new FileWriter(f);
				FileReader fr = new FileReader(f))
		{
			String data = "public class @class@ {\r\n" + 
					"    public @type@ @property@;\r\n" + 
					"    public @class@() {\r\n" + 
					"    }\r\n" + 
					"    public void set@Uproperty@(@type@  @property@){\r\n" + 
					"        this.@property@ = @property@;\r\n" + 
					"    }\r\n" + 
					"      \r\n" + 
					"    public @type@  get@Uproperty@(){\r\n" + 
					"        return this.@property@;\r\n" + 
					"    }\r\n" + 
					"}"
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
