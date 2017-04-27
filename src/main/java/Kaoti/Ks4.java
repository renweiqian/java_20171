package Kaoti;

import java.util.Random;

/**
 * Created by 任纹乾 on
 * 2017/4/22.
 */
//编写一个程序实现以下功能:
//(1)产生5000个1~9999之间的随机整数,将其存入文本文件a.txt中
    //    (2)从文件中读取这5000个整数,并计算其最大值、最小值和平均值并输出结果。
public class Ks4 {
    public static void main(String[] args) {
        Random ran = new Random();
        for(int i=0;i<5000;i++){
            int num = ran.nextInt(9999);
            System.out.println(num+"\t");
        }
    }
}
