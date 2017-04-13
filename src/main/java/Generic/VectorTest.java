package Generic;

import java.util.Vector;

/**
 * Created by 任纹乾 on
 * 2017/4/13.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("test...");
        vector.add("123");
        vector.add("true");
        vector.add("456");

        String s = vector.get(3);
        System.out.println(s);

    }
}
