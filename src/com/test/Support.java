package com.test;

public class Support extends Hero implements Healer{

	@Override
	public void heal() {
		System.out.println("进行了一次治疗");
		
	}
	
}
