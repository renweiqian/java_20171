package Kaoti;

import java.util.Scanner;

/**
 * Created by 任纹乾 on
 * 2017/4/1.
 */
public class St1{
    public static void main(String[] args) {
        int[][] ints = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int x = 1; x < ints.length; x++) {
            for (int y = 1; y < ints[x].length; y++) {
                System.out.print("请输入" + x + "行" + y + "列的数：");
                ints[x][y] = scanner.nextInt();
            }
            System.out.println();
        }
        int n = 0;
        for (int i = 0; i < ints.length; i++) {
            n *= ints[i][i];
        }
        System.out.println("主对角线上元素的乘积为：" + n);
        int k = 0;
        for (int i = 0; i < ints.length; i++) {
            k *= ints[i][4 - i];
        }
        System.out.println("副对角线上元素的乘积为：" + k);

    }
}
