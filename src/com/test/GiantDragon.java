package com.test;

public class GiantDragon {
	/*����ģʽ
	 * 1�����췽����ʼ��
	 * 2����̬����ָ��ʵ��
	 * 3.public static ��  getInstance���������صڶ����ľ�̬����
	 */
//  ����ʽ	
//	private GiantDragon() {
//		
//	}
//
//	private static GiantDragon instance = new GiantDragon();
//	
//	public static GiantDragon getInstance() {
//		return instance;
//	}
	
//	����ʽ
	private GiantDragon() {
		
	}
	
	private static GiantDragon instance ;
	
	public static GiantDragon getInstance() {
		if(instance == null)
			instance = new GiantDragon();
		return instance;
	}
}
