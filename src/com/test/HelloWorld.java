package com.test;

import java.util.Scanner;
/*
 * 
 * 
 * Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���
1����ĸ�ͷ��Ӳ���ͬʱΪż��
2����ĸ�ͷ��� ȡֵ��Χ��[1-20]
*/
public class HelloWorld {
	public static void main (String[] args) {
		int fenZi ;
		int fenMu ;
		double result ;
		double min=10;
		float minFenZi=0;
		float minFenMu=0;
		for (int j=1 ; j<21;j++) {
			fenMu = j;
			for (int i=1;i<21;i++) {
				fenZi = i;
				
				if(0 == fenZi%2 && 0==fenMu%2)
					continue;
//��仰���ɻ�				
/*				//double value = (double)fenZi/fenMu;
 *                result = value -0.618;
				��������Ĳ����ԣ�Ϊʲô��
				//result = (double)((double)(fenZi/fenMu) -0.618) ;

*
*/				
				double value =(double)fenZi/fenMu;
				result = value -0.618;
				
				
//ȡ����ֵ				
				result = result<0 ? 0-result :result;
				
				if(result<min) {
					min = result;
					minFenZi = fenZi;
					minFenMu = fenMu;
				}
			}
		}
        System.out.println("��ƽ�ָ��0.618������������ӷ�ĸ��"+minFenZi+"����"+minFenMu);
	
	
	
	
	
	
	
	
	
	
	}
}







/* 

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("�������ܼ���������1-7");
int data = s.nextInt();
String today = (data<6)? "�����ǹ�����":"��������ĩ";
System.out.println(today);

}
*/