package com.test;

public class Item {
	String 	name;
	int price;
    public Item(){
        
    }
     
    //�ṩһ����ʼ��name�Ĺ��췽��
    public Item(String name){
        this.name = name;
    }
     
    public void effect(){
        System.out.println("��Ʒʹ�ú󣬿�����Ч��");
    }
}
