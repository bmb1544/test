package collection;
   
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
  
import com.test.Hero;
   
public class TestCollection {
    public static void main(String[] args) {
        Random r =new Random();
        List<Hero> heros = new ArrayList<Hero>();
          
        for (int i = 0; i < 10; i++) {
            //ͨ�����ֵʵ����hero��hp��damage
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
          
        System.out.println("��ʼ����ļ���");
        System.out.println(heros);
          
        //Hero��ʵ���˽ӿ�Comparable�����Դ��Ƚ���Ϣ��
        //Collectionsֱ�ӽ���������������Comparator
        Collections.sort(heros);
        System.out.println("�����˺��ߵ������ļ���");
        System.out.println(heros);
          
    }
}