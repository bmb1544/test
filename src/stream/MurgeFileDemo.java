package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class MurgeFileDemo {
	
	public static void main(String[] args) {
		murgeFile("d:/","eclipse.exe");
	}
	
	/**
     * �ϲ���˼·�����Ǵ�eclipse.exe-0��ʼ����ȡ��һ���ļ����Ϳ�ʼд���� eclipse.exe�У�ֱ��û���ļ����Զ�
     * @param folder
     *            ��Ҫ�ϲ����ļ������ڵ�Ŀ¼
     * @param fileName
     *            ��Ҫ�ϲ����ļ�������
     * @throws FileNotFoundException
     */
	
	private static void murgeFile(String folder,String fileName) {
		File destFile = new File(folder,fileName);
		try(FileOutputStream fos = new FileOutputStream(destFile)) {
			//�ϲ���Ŀ���ļ�
			int index = 0;
			while(true) {
				//���ļ�
				File eachFile = new File(folder,fileName + "-" + index++);
				//������ļ������������
				if(!eachFile.exists())
					break;
				
				//��ȡ���ļ�����
				try(FileInputStream fis = new FileInputStream(eachFile)){
					byte[] eachContent = new byte[(int)eachFile.length()];
					fis.read(eachContent);
					fis.close();
				
					//�����ļ�����д��ȥ
					fos.write(eachContent);
					fos.flush();
					System.out.printf("�����ļ�%sд��Ŀ���ļ���ȥ%n",eachFile);
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
			}	
			
			System.out.printf("���Ŀ���ļ�%s �Ĵ�СΪ%d ",destFile,destFile.length());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
