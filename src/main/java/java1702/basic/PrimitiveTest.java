package java1702.basic;

/**
 * Created by 任纹乾 on
 * 2017/3/24.
 */
public class PrimitiveTest {
    private static void method(int i){
        System.out.println("b:"+ i);
        i++;
        System.out.println("c:"+ i);
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a:"+ i);
        method(i);
        System.out.println("d:"+ i);
    }
}
