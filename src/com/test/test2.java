package com.test;
import java.util.Scanner;//����Scanner��
/*
 * ���󣺸�3���༶��4λͬѧ¼��ɼ��������ÿ���༶��ƽ��ֵ
 */

public class test2{
	public static void main(String[] args) {
		 boolean breakout = false; //�Ƿ���ֹ�ⲿѭ���ı��
	        for (int i = 0; i < 10; i++) {
	 
	            for (int j = 0; j < 10; j++) {
	                System.out.println(i + ":" + j);
	                if (0 == j % 2) {
	                    breakout = true; //��ֹ�ⲿѭ���ı������Ϊtrue
	                    break;
	                }
	            }
	            if (breakout) //�ж��Ƿ���ֹ�ⲿѭ��
	                break;
	        }
	}
}
