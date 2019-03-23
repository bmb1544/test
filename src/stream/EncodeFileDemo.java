package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncodeFileDemo {
	public static void main(String[] args) {
		File srcFile = new File("d:/srcFile.txt");
		File tgtFile = new File("d:/tgtFile.txt");
		encodeFile(srcFile,tgtFile);
	}
	
	private static void encodeFile(File encodingFile,File encodedFile) {
		try(FileReader fr = new FileReader(encodingFile);FileWriter fw = new FileWriter(encodedFile)){
			//先把源文件内容读出来
			char[] fileContent = new char[(int)encodingFile.length()];
			fr.read(fileContent);
			System.out.printf("加密前内容：%n%s%n",new String(fileContent));
			
			encode(fileContent);//加密，另起方法，活用，程序简洁方便
			
			//把加密后的内容写进目标文件
			fw.write(fileContent);
			System.out.printf("加密后内容：%n%s",new String(fileContent));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void encode(char[] fileContent) {
		for(int i = 0;i < fileContent.length;i++) {
			char a = fileContent[i];
			if(isLetterOrDigit(a)) {
				switch(a){
				case '9':
					a = '0';
					break;
				case 'z':
					a = 'a';
					break;
				case 'Z':
					a = 'A';
					break;
				default:
					a++;
					break;
				}
			}
			fileContent[i] = a;
		}
	}
	
	private static boolean isLetterOrDigit(char a) {
		String letterOrDigital = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return -1 == letterOrDigital.indexOf(a) ? false : true;
	}
	
	
}
