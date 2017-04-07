package BasicLearning;

import java.util.Scanner;

/**
 * Created by 任纹乾 on
 * 2017/3/31.
 */
public class Basics3 {//声明类
       public static void main(String[] args) {//主方法
        Scanner scan = new Scanner(System.in );//System.out.println("请输入变量A的值");创建扫描器

        long A = scan.nextLong();//接受第一个变量值
        System.out.println("请输入变量B的值");
        long B = scan.nextLong();//接受第二个变量值
        System.out.println("A = "+ A + "\tB ="+ B);
        System.out.println("执行变量互换。。。");//执行变量互换
        A = A ^ B;
        B = B ^ A;
        A = A ^ B;
        System.out.println("A = "+ A + "\tB ="+ B);//输出交换的结果

    }

}
