package Kaoti;

import java.util.Scanner;

/**
 * Created by 任纹乾 on
 * 2017/4/8.
 */
//接受用户输入的一个字符串，将其每个字节的数据相加求和输出
public class Stm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("请输入");
         String s= scanner.nextLine();
         int n = 0;
        for(int i=0;i<s.length();i++){
          n = n + s.charAt(i);
        }
        System.out.println(n);
    }


    }




