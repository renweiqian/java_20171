package java1702.basic;

/**
 * Created by 任纹乾 on
 * 2017/3/27.
 */
public class PrimitivesTest {
    // java.lang.String FQN
    private static void method(boolean b) { // 值传递
        System.out.println("b: " + b); // hello
        b =false;
        System.out.println("c: " + b); // hi
    }

    public static void main(String[] args) {
       boolean b = true;
        System.out.println("a: " +b); // hello
        method(b);
        System.out.println("d: " + b); // hello
    }
}
