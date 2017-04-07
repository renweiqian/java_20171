package BasicLearning;

import java.util.Scanner;

/**
 * Created by 任纹乾 on
 * 2017/4/7.
 */
public class Basic6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int ints = scanner.nextInt();
        String chack = (ints %2==0)?"这个数是：偶数":"这个数是：奇数";
        System.out.println(chack);
    }
}
