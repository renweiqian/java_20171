package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 任纹乾 on
 * 2017/4/12.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String>msp = new HashMap<>();//
        msp.put(1,"a");
        msp.put(100,"bcd");
        msp.put(1000,"efgh");
        msp.put(10000,"drga");



        System.out.println(msp.size());
        System.out.println(msp.get(100));
        for (Integer integer:msp.keySet()){
            System.out.println(integer+">"+msp.get(integer));
        }
        for (String s :msp.values()){
            System.out.println(s);
        }
        for (Map.Entry<Integer,String> entry: msp.entrySet()){
            System.out.println(entry.getKey()+">"+entry.getValue());


        }

    }
}
