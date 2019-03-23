package com.test.animal;

public  abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {    //漏了int不行
		this.legs = legs;
	}
	
	public abstract void eat();
	
	public void walk() {
		System.out.println("动物是用"+this.legs+" 条腿来走路的");
	}
}
