package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutoCreatClass_Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//��������
		System.out.println("������������ƣ�");
	    String className = s.nextLine();
	    //������������
	    System.out.println("���������Ե����ͣ�");
	    String type = s.nextLine();
	    //������������
	    System.out.println("���������Ե����ƣ�");
	    String property = s.nextLine();
	    
	    //�������ƣ�����ĸ��д��
	    String Uproperty = toUpperFirstLetter(property);
	    
	    //������ɣ���ʼ����ģ���ļ���ȡ
	    File modelFile = new File("d:/model.txt");
	    String modelContent = null;
	    try(FileReader fr = new FileReader(modelFile)){
	    	char[] cs = new char[(int)modelFile.length()];
	    	fr.read(cs);
	    	modelContent = new String(cs);
	    	
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
	    
	    //��ʼ�滻
	    String fileContent = modelContent.replaceAll("@class@",className);
	    	   fileContent = fileContent.replaceAll("@type@",type);
	    	   fileContent = fileContent.replaceAll("@property@",property);
	    	   fileContent = fileContent.replaceAll("@Uproperty@",Uproperty);
	    
	   //�����ļ���
	    String fileName = className +".txt";
	    
	    System.out.println("�滻������ݣ�");
        System.out.println(fileContent);
	    
	    //���滻������д��Ŀ���ļ�
	    File srcFile = new File("d:/",fileName);
	    
	    try(FileWriter fw = new FileWriter(srcFile)){
	    	
	    	fw.write(fileContent);
	    	
	    }catch (IOException e) {
	    	e.printStackTrace();
	    }
	    
	    
	    
	}

	public static String toUpperFirstLetter(String str) {
		//������ĸȡ�������������Ϊ��д
		char firstLetter =Character.toUpperCase(str.charAt(0));
		//ȡ��������ĸ����������
		String rest = str.substring(1);
		return firstLetter + rest;
	}
	
}
