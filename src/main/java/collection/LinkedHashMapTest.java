package collection;

import java.util.LinkedHashMap;

/**
 * Created by 任纹乾 on
 * 2017/4/12.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>map = new LinkedHashMap<>();
        map.put(1,"a");
        map.put(-1,"acd");
        map.put(100,"c");
        System.out.println(map.size());
        System.out.println(map.get(-1));
        for (Integer integer : map.keySet()) {
            System.out.println(integer+">"+map.get(integer));

        }
    }


}
