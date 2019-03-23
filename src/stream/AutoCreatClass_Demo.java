package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutoCreatClass_Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//类名输入
		System.out.println("请输入类的名称：");
	    String className = s.nextLine();
	    //属性类型输入
	    System.out.println("请输入属性的类型：");
	    String type = s.nextLine();
	    //属性名称输入
	    System.out.println("请输入属性的名称：");
	    String property = s.nextLine();
	    
	    //属性名称（首字母大写）
	    String Uproperty = toUpperFirstLetter(property);
	    
	    //输入完成，开始进行模板文件读取
	    File modelFile = new File("d:/model.txt");
	    String modelContent = null;
	    try(FileReader fr = new FileReader(modelFile)){
	    	char[] cs = new char[(int)modelFile.length()];
	    	fr.read(cs);
	    	modelContent = new String(cs);
	    	
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
	    
	    //开始替换
	    String fileContent = modelContent.replaceAll("@class@",className);
	    	   fileContent = fileContent.replaceAll("@type@",type);
	    	   fileContent = fileContent.replaceAll("@property@",property);
	    	   fileContent = fileContent.replaceAll("@Uproperty@",Uproperty);
	    
	   //定义文件名
	    String fileName = className +".txt";
	    
	    System.out.println("替换后的内容：");
        System.out.println(fileContent);
	    
	    //将替换后内容写进目标文件
	    File srcFile = new File("d:/",fileName);
	    
	    try(FileWriter fw = new FileWriter(srcFile)){
	    	
	    	fw.write(fileContent);
	    	
	    }catch (IOException e) {
	    	e.printStackTrace();
	    }
	    
	    
	    
	}

	public static String toUpperFirstLetter(String str) {
		//将首字母取出来，并将其变为大写
		char firstLetter =Character.toUpperCase(str.charAt(0));
		//取出除首字母外后面的内容
		String rest = str.substring(1);
		return firstLetter + rest;
	}
	
}
