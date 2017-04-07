package Kaoti;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 任纹乾 on
 * 2017/4/1.
 */
public class St1{
    public static void main(String[] args) {
        int[][] ints = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < ints.length; i++) {
            for (int j =0; j < ints[i].length; j++) {
                System.out.print("请输入"+(i+1)+"行"+(j+1)+"列" );
                ints[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += ints[i][j];
                }
                if (i + j == ints.length - 1) { // ?
                    mul *= ints[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(ints));
        System.out.println(sum);
        System.out.println(mul);
            }
        }
       /* int n = 0;
        for (int i = 0; i < ints.length; i++) {
            n *= ints[i][i];
        }
        System.out.println("主对角线上元素的乘积为：" + n);
        int k = 0;
        for (int i = 0; i < ints.length; i++) {
            k *= ints[i][4 - i];
        }
        System.out.println("副对角线上元素的乘积为：" + k);*/


