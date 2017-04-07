package BasicLearning;

/**
 * Created by 任纹乾 on
 * 2017/4/5.
 */
public class Basic5 {
    private static void test(int  x) { // 形参
        System.out.println("b: " + x); // 0
       x++;
        System.out.println("c: " + x); // 1
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a: " + i); // 0
       test(i); // 实参
        System.out.println("d: " + i); // 0
    }
}
