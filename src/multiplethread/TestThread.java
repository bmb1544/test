package multiplethread;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.test.*;  

     
public class TestThread {
	    
	    public static void main(String[] args) {
	    	final Hero gareen = new Hero();
	        gareen.name = "盖伦";
	        gareen.hp = 616;
	           
	        Thread t1 = new Thread(){
	            public void run(){
	                while(true){
	                     
	                    //因为减血更快，所以盖伦的血量迟早会到达1
	                    //使用while循环判断是否是1，如果是1就不停的循环
	                    //直到加血线程回复了血量
//	                    while(gareen.hp==1){
//	                        continue;
//	                    }
	                    /*if(gareen.hp == 1)*/
	                    gareen.hurt();
	                    System.out.printf("t1 为%s 减血1点,减少血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
	                    try {
	                        Thread.sleep(10);
	                    } catch (InterruptedException e) {
	                        // TODO Auto-generated catch block
	                        e.printStackTrace();
	                    }
	                }
	 
	            }
	        };
	        t1.start();
	 
	        Thread t2 = new Thread(){
	            public void run(){
	                while(true){
	                    gareen.recover();
	                    System.out.printf("t2 为%s 回血1点,增加血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
	 
	                    try {
	                        Thread.sleep(100);
	                    } catch (InterruptedException e) {
	                        // TODO Auto-generated catch block
	                        e.printStackTrace();
	                    }
	                }
	 
	            }
	        };
	        t2.start();
	    
	        
	    }
}
		//当前线程暂停		
//		Thread t1 = new Thread() {
//			public void run() {
//				int seconds = 0;
//				while(true) {
//					
//					try{
//						Thread.sleep(1000);
//					}catch(InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.printf("时间过了%d秒%n",seconds++);
//				}
//			}
//		};
//		t1.start();
		
		

		
/********************************************************************/   	
/********************************************************************/   
/********************************************************************/   
//		Hero gareen = new Hero();
//        gareen.name = "盖伦";
//        gareen.hp = 616;
//        gareen.damage = 50;
// 
//        Hero teemo = new Hero();
//        teemo.name = "提莫";
//        teemo.hp = 300;
//        teemo.damage = 30;
//         
//        Hero bh = new Hero();
//        bh.name = "赏金猎人";
//        bh.hp = 500;
//        bh.damage = 65;
//         
//        Hero leesin = new Hero();
//        leesin.name = "盲僧";
//        leesin.hp = 455;
//        leesin.damage = 80;
        
//      1、集成线程类
//        KillThread killThread1 = new KillThread(gareen,teemo);
//        killThread1.start();
//        KillThread killThread2 = new KillThread(bh,leesin);
//        killThread2.start();

        /* 为什么没import，也能创建对象，是不是因为同包？*/
/********************************************************************/        
//      2、 Runnable接口
//        Battle battle1 = new Battle(gareen,teemo);
//        
//        new Thread(battle1).start();
//        
//        Battle battle2 = new Battle(bh,leesin);
//        new Thread(battle2).start();
        
//      3、匿名类
//        Thread t1 = new Thread() {
//        	public void run() {
//        		while(!teemo.isDead()) {
//        			gareen.attackHero(teemo);
//        		}
//        	}
//        }; //注意要加分号
//        
//        t1.start();
//        
//        Thread t2 = new Thread() {
//        	public void run() {
//        		while(!leesin.isDead()) {
//        			bh.attackHero(leesin);
//        		}
//        	}
//        };
//        
//        t2.start();

