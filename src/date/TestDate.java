package date;

import java.util.Date;
import java.util.Calendar;

//׼��һ��������9����������
//ʹ��1970��-2000��֮���������ڳ�ʼ��������
//������Щ���ڵ�ʱ�������������
//���� 1988-1-21 12:33:22 �ͻ����� 1978-4-21 19:07:23 ǰ�棬��Ϊ����ʱ���С����Ȼ���ڸ���
public class TestDate {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		Date d = c.getTime();
		
		Date d2 = new Date(0);
		
		c.setTime(d2);
		

		
		
		
	}


}
