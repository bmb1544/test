package com.test;



public class Hero {
	public String name;
    public/* volatile*/ float hp;
     
    public int damage;
     
    //��Ѫ
    public synchronized void recover(){
        hp=hp+1;
        this.notify();
    }
     
    //��Ѫ
    public synchronized void hurt(){
        if(hp == 1) {
        	try {
        		this.wait();
        	}catch(InterruptedException e) {
        		e.printStackTrace();
        	}
        }
        	
    	hp=hp-1;
        
    }
    
    
    public void attackHero(Hero h) {
//        try {
//            //Ϊ�˱�ʾ������Ҫʱ�䣬ÿ�ι�����ͣ1000����
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    	
    	
        h.hp-=damage;
        System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);
         
        if(h.isDead())
            System.out.println(h.name +"���ˣ�");
    }
 
    public boolean isDead() {
        return 0>=hp?true:false;
    }

    
      
}




       




/*
public class Hero {
	String name;
	float hp;
	float armor;
	int movSpeed;

	
	void keng() {
		System.out.println("�Ӷ���");
	

	}
	float getArmor() {
		return armor;
	}

	void addSpeed(int speed) {
		movSpeed = movSpeed + speed;
	}
	
	void legendary() {
		System.out.println("����");
	}
	
	float getHp() {
		return hp;
	}
	
	void recovery(float blood) {    //��ס�����Ϊvoid�����÷���ʱ�����з���ֵ
		hp = hp +blood;
	}
	
	
	
	
	public static void main(String[] args) {

		char c = 'a';
		short s = 80;
		s =(short)c ;
	

		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.movSpeed = 350;
		garen.addSpeed(100);
        System.out.println(garen.name + " ��ǰ��Ѫ���� " +garen.hp);

        System.out.println("��Ѫ100");

        garen.recovery(100);

        System.out.println("���ڵ�Ѫ����:" + garen.hp);
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.movSpeed = 330;
		

		}

*/
	
	
	
	
	

