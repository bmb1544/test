package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.test.*;

public class SerializedArrays_Demo {
	public static void main(String[] args) {
		File f = new File("d:/heros.lol");
		

		SerializedArrays(f);
		
	}
	
	private static void SerializedArrays(File f){
		Hero[] heros1 = new Hero[10];
		for(int i = 0;i < 10;i++) {
			heros1[i] = new Hero(""+i);
			System.out.println(heros1[i].name);
		}
		
		try(
	            //创建对象输出流
	            FileOutputStream fos = new FileOutputStream(f);
	            ObjectOutputStream oos =new ObjectOutputStream(fos);
	            //创建对象输入流              
	            FileInputStream fis = new FileInputStream(f);
	            ObjectInputStream ois =new ObjectInputStream(fis);
				)
		{
			oos.writeObject(heros1);
			Hero[] heros2 = (Hero[])ois.readObject();
			for(Hero a : heros2) {
				System.out.println(a.name);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
