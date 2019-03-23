package com.test;

import java.util.Scanner;
/*
 * 
 * 
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
1、分母和分子不能同时为偶数
2、分母和分子 取值范围在[1-20]
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
//这句话有疑惑				
/*				//double value = (double)fenZi/fenMu;
 *                result = value -0.618;
				运行下面的不可以，为什么？
				//result = (double)((double)(fenZi/fenMu) -0.618) ;

*
*/				
				double value =(double)fenZi/fenMu;
				result = value -0.618;
				
				
//取绝对值				
				result = result<0 ? 0-result :result;
				
				if(result<min) {
					min = result;
					minFenZi = fenZi;
					minFenMu = fenMu;
				}
			}
		}
        System.out.println("离黄金分割点0.618最近的两个分子分母是"+minFenZi+"除以"+minFenMu);
	
	
	
	
	
	
	
	
	
	
	}
}







/* 

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("今天是周几？请输入1-7");
int data = s.nextInt();
String today = (data<6)? "今天是工作日":"今天是周末";
System.out.println(today);

}
*/