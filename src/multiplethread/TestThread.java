package multiplethread;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.test.*;  

     
public class TestThread {
	    
	    public static void main(String[] args) {
	    	final Hero gareen = new Hero();
	        gareen.name = "����";
	        gareen.hp = 616;
	           
	        Thread t1 = new Thread(){
	            public void run(){
	                while(true){
	                     
	                    //��Ϊ��Ѫ���죬���Ը��׵�Ѫ������ᵽ��1
	                    //ʹ��whileѭ���ж��Ƿ���1�������1�Ͳ�ͣ��ѭ��
	                    //ֱ����Ѫ�̻߳ظ���Ѫ��
//	                    while(gareen.hp==1){
//	                        continue;
//	                    }
	                    /*if(gareen.hp == 1)*/
	                    gareen.hurt();
	                    System.out.printf("t1 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
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
	                    System.out.printf("t2 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
	 
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
		//��ǰ�߳���ͣ		
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
//					System.out.printf("ʱ�����%d��%n",seconds++);
//				}
//			}
//		};
//		t1.start();
		
		

		
/********************************************************************/   	
/********************************************************************/   
/********************************************************************/   
//		Hero gareen = new Hero();
//        gareen.name = "����";
//        gareen.hp = 616;
//        gareen.damage = 50;
// 
//        Hero teemo = new Hero();
//        teemo.name = "��Ī";
//        teemo.hp = 300;
//        teemo.damage = 30;
//         
//        Hero bh = new Hero();
//        bh.name = "�ͽ�����";
//        bh.hp = 500;
//        bh.damage = 65;
//         
//        Hero leesin = new Hero();
//        leesin.name = "äɮ";
//        leesin.hp = 455;
//        leesin.damage = 80;
        
//      1�������߳���
//        KillThread killThread1 = new KillThread(gareen,teemo);
//        killThread1.start();
//        KillThread killThread2 = new KillThread(bh,leesin);
//        killThread2.start();

        /* Ϊʲôûimport��Ҳ�ܴ��������ǲ�����Ϊͬ����*/
/********************************************************************/        
//      2�� Runnable�ӿ�
//        Battle battle1 = new Battle(gareen,teemo);
//        
//        new Thread(battle1).start();
//        
//        Battle battle2 = new Battle(bh,leesin);
//        new Thread(battle2).start();
        
//      3��������
//        Thread t1 = new Thread() {
//        	public void run() {
//        		while(!teemo.isDead()) {
//        			gareen.attackHero(teemo);
//        		}
//        	}
//        }; //ע��Ҫ�ӷֺ�
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

