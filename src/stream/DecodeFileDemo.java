package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DecodeFileDemo {
	public static void main(String[] args) {
		File srcFile = new File("d:/tgtFile.txt");
		File tgtFile = new File("d:/decoded-tgtFile.txt");
		
		decodeFile(srcFile,tgtFile);
	}
	
	private static void decodeFile(File decodingFile,File decodedFile) {
		try(FileReader fr = new FileReader(decodingFile);FileWriter fw = new FileWriter(decodedFile)){
			//��Դ�ļ���ȡ����
			char[] fileContent = new char[(int)decodingFile.length()];
			fr.read(fileContent);
			System.out.printf("����ǰ���ݣ�%n%s%n",new String(fileContent));
			//����
			decode(fileContent);
			
			//�����ܺ�����д��Ŀ���ļ�
			fw.write(fileContent);
			System.out.printf("���ܺ����ݣ�%n%s%n",new String(fileContent));
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void decode(char[] fileContent) {
		for(int i = 0;i < fileContent.length;i++) {
			char a = fileContent[i];
			if(isLetterOrDigit(a)) {
				switch(a) {
				case '0':
					a = '9';
					break;
				case 'a':
					a = 'z';
					break;
				case 'A':
					a = 'Z';
					break;
				default:
					a--;
					break;
				}
			}
			fileContent[i] = a;
		}
	}
	
	private static boolean isLetterOrDigit(char a) {
		String letterOrDigital = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return -1 == letterOrDigital.indexOf(a) ? false : true ;
	}
}
