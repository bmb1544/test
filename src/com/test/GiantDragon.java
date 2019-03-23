package com.test;

public class GiantDragon {
	/*单例模式
	 * 1、构造方法初始化
	 * 2、静态属性指向实例
	 * 3.public static 的  getInstance方法，返回第二步的静态属性
	 */
//  饿汉式	
//	private GiantDragon() {
//		
//	}
//
//	private static GiantDragon instance = new GiantDragon();
//	
//	public static GiantDragon getInstance() {
//		return instance;
//	}
	
//	懒汉式
	private GiantDragon() {
		
	}
	
	private static GiantDragon instance ;
	
	public static GiantDragon getInstance() {
		if(instance == null)
			instance = new GiantDragon();
		return instance;
	}
}
