package Kaoti;

import java.util.Arrays;

/**
 * Created by 任纹乾 on
 * 2017/4/15.
 */
//拆分字符串，字符串中含有逗号和数字，对数字排序并输出
//    例如：String s0=”123,45,25,85”;
//     输出：25 45 85 123
public class Jhkt3 {
    public static void main(String[] args) {
        String s0="123,45,25,85";
        String[] s1= s0.split(",");
      int[] k = new int[s1.length];
        for(int i = 0; i<s1.length; i++)
           k[i]=Integer.parseInt(s1[i]);
        Arrays.sort(k);
        for(Integer number:k)
            System.out.print(number+" ");

    }
    }
