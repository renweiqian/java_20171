package java1702.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 任纹乾 on
 * 2017/3/21.
 */
//猜数字
    //生成一个随机整数（10000）100 小了 1000 小了 100000 大了  10000 对了
public class EE1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        System.out.println("在此输入整数");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (y == 10000) {
            System.out.println("对");}
        else if (y > 10000) {
            System.out.println("错");
        }
        else if (y < 10000) {
            System.out.println("错");
        }
    }
}
