package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SplitFileDemo {
	public static void main(String[] args) {
		//����100kb�ĳ���
		int eachSize = 100*1024; 
		//�����ļ����󣬻�ȡ��Ҫ��ֵ�Դ�ļ�
		File srcFile = new File ("d:/eclipse.exe");
		splitFile(srcFile,eachSize);
	}
    /**
     * ��ֵ�˼·���Ȱ�Դ�ļ����������ݶ�ȡ���ڴ��У�Ȼ����ڴ��а����ֵ����ļ���
     * @param srcFile Ҫ��ֵ�Դ�ļ�
     * @param eachSize ���������С�����
     */
	private static void splitFile(File srcFile,int eachSize) {
		if(0 == srcFile.length()) 
			throw new RuntimeException("�ļ�����Ϊ0�����ɲ��");

		byte[] fileContent = new byte[(int) srcFile.length()];
		// �Ȱ��ļ���ȡ��������
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(srcFile);
			fis.read(fileContent);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(null != fis)
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
		// ������Ҫ�����ֳɶ��ٷ����ļ�
		int fileNumber;
		  // �ļ��Ƿ��ܱ������õ������ļ������ǲ�һ����
        // (�����ļ�������25��ÿ�ݵĴ�С��5����ô��Ӧ����5��) 
        // (�����ļ�������26��ÿ�ݵĴ�С��5����ô��Ӧ����6��)
		if (0 == srcFile.length() % eachSize)
			fileNumber = (int)(srcFile.length() / eachSize);
		else 
			fileNumber = (int)(srcFile.length() / eachSize) + 1 ;
		
		for(int i = 0;i < fileNumber;i++) {
			String eachFileName = srcFile.getName() + "-" + i ;
			File eachFile = new File(srcFile.getParent(),eachFileName);
			byte[] eachContent ;
            // ��Դ�ļ�����������Ʋ������ݵ����ļ�
            // �������һ���ļ��������ļ���С����100k
            // ���һ���ļ��Ĵ�С��ʣ���
			if(i != fileNumber - 1)	// �������һ��
				eachContent = Arrays.copyOfRange(fileContent,eachSize * i,eachSize *(i+1));
			else // ���һ��
				eachContent = Arrays.copyOfRange(fileContent, eachSize * i, fileContent.length);
			
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(eachFile);
				fos.write(eachContent);
				fos.close();
				System.out.printf("������ļ�%s�����С�� %d���ֽ�%n",eachFile.getAbsoluteFile(),eachFile.length());
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				if(null != fos)
					try {
						fos.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
			}
			
			
		}
	}
}
