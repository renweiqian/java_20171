package Kaoti;

/**
 * Created by 任纹乾 on
 * 2017/4/22.
 */
//编写一个程序实现以下功能:
//(1)产生5000个1~9999之间的随机整数,将其存入文本文件a.txt中
    //    (2)从文件中读取这5000个整数,并计算其最大值、最小值和平均值并输出结果。
public class Ks4 {
    public static void main(String[] args)
    {
        int value=1;
        for (int i= 1; i<=10; i++) {
            value+=findn(i);
            System.out.println("n值为："+i+" value值为："+value);//可注掉，调试时看值。
            if(value>9999){
                System.out.println("最大n值为："+(i-1)+" 最大value值为："+(value-findn(i)));
                break;
            }
        }
    }
    static long findn(int n)
    {
        if (n == 1)return 1;
        else return n * findn(n - 1);
    }

}
