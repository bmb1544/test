package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.test.Hero;

public class ObjectStream_Test {
	
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "garen";
		h.hp = 616;
		
		File f = new File("d:/garen.lol");
		
		try(
	            //创建对象输出流
	            FileOutputStream fos = new FileOutputStream(f);
	            ObjectOutputStream oos =new ObjectOutputStream(fos);
	            //创建对象输入流              
	            FileInputStream fis = new FileInputStream(f);
	            ObjectInputStream ois =new ObjectInputStream(fis);
				)
		{
			oos.writeObject(h);
			Hero h2 = (Hero) ois.readObject();
			
			System.out.println(h2.name);
			System.out.println(h2.hp);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
