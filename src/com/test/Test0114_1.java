package com.test;

public class Test0114_1 {
	 
    String name;
 
    float hp;
 
    float armor;
 
    int moveSpeed;
 
    // 方法名和类名一样（包括大小写）
    // 没有返回类型
    public Test0114_1() {
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }
     
    public static void main(String[] args) {
        //实例化一个对象的时候，必然调用构造方法
    	Test0114_1 h = new Test0114_1();
    }
 

}


