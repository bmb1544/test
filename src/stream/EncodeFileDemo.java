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
			//�Ȱ�Դ�ļ����ݶ�����
			char[] fileContent = new char[(int)encodingFile.length()];
			fr.read(fileContent);
			System.out.printf("����ǰ���ݣ�%n%s%n",new String(fileContent));
			
			encode(fileContent);//���ܣ����𷽷������ã������෽��
			
			//�Ѽ��ܺ������д��Ŀ���ļ�
			fw.write(fileContent);
			System.out.printf("���ܺ����ݣ�%n%s",new String(fileContent));
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
