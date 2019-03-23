package com.test.animal;

public class Fish extends Animal implements Pet{

	private String name;
	
	protected Fish() {
		super(0);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Fish is playing");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish eat");
	}
	
	public void walk() {
		System.out.println("”„√ª”–Õ»");
	}
	
	

}
