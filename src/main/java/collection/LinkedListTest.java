package collection;

import com.sun.org.apache.xpath.internal.operations.String;
import java.util.LinkedList;
/**
 * Created by 任纹乾 on
 * 2017/4/11.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<java.lang.String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");

        System.out.println(strings.size());
        System.out.println(strings.get(0));

        for (java.lang.String string:strings){
            System.out.println(string);
        }
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());


    }
}
