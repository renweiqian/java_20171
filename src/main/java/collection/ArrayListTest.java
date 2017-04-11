package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 任纹乾 on
 * 2017/4/11.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> string1 = new ArrayList<>();
        string1.add("a");
        string1.add("b");
        List<String> string2 = new ArrayList<>();
        string2.add("a");
        string2.add("b");
        string2.add("c");
        System.out.println(string1.equals(string2));
        List<String> string3 = string2.subList(1,3);
        System.out.println(string3);
        System.out.println(string3.containsAll(string1));
        string1.removeAll(string3);
        System.out.println(string3);
        System.out.println(string2);
        string3.removeAll(string2);
        System.out.println(string3);
    }
}
