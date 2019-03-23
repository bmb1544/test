package com.test;



public class Hero {
	public String name;
    public/* volatile*/ float hp;
     
    public int damage;
     
    //回血
    public synchronized void recover(){
        hp=hp+1;
        this.notify();
    }
     
    //掉血
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
//            //为了表示攻击需要时间，每次攻击暂停1000毫秒
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    	
    	
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
         
        if(h.isDead())
            System.out.println(h.name +"死了！");
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
		System.out.println("坑队友");
	

	}
	float getArmor() {
		return armor;
	}

	void addSpeed(int speed) {
		movSpeed = movSpeed + speed;
	}
	
	void legendary() {
		System.out.println("超神");
	}
	
	float getHp() {
		return hp;
	}
	
	void recovery(float blood) {    //记住如果不为void，调用方法时必须有返回值
		hp = hp +blood;
	}
	
	
	
	
	public static void main(String[] args) {

		char c = 'a';
		short s = 80;
		s =(short)c ;
	

		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.movSpeed = 350;
		garen.addSpeed(100);
        System.out.println(garen.name + " 当前的血量是 " +garen.hp);

        System.out.println("回血100");

        garen.recovery(100);

        System.out.println("现在的血量是:" + garen.hp);
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.movSpeed = 330;
		

		}

*/
	
	
	
	
	

