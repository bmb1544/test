package com.test.animal;

public  abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {    //©��int����
		this.legs = legs;
	}
	
	public abstract void eat();
	
	public void walk() {
		System.out.println("��������"+this.legs+" ��������·��");
	}
}
