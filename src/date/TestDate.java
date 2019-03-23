package date;

import java.util.Date;
import java.util.Calendar;

//准备一个长度是9的日期数组
//使用1970年-2000年之间的随机日期初始化该数组
//按照这些日期的时间进行升序排序
//比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
public class TestDate {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		Date d = c.getTime();
		
		Date d2 = new Date(0);
		
		c.setTime(d2);
		

		
		
		
	}


}
