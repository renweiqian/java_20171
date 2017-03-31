package BasicLearning;

/**
 * Created by 任纹乾 on
 * 2017/3/31.
 */
public class Basic2 {//新建类
       int age;//声明int变量
       char char1 = 'r';//声明char型变量并赋值
      static final double PI = 3.14F;//声明double型常量并赋值
       final boolean BOOL = true;//声明boolean型常量并赋值
       int x  = 5;//定义实例变量
    static   int times = 3 ;//定义成员变量times//定义的静态变量
    public static void main(String[] args) {//主方法
        final int m;
        m = 123;
        times = 6;
        int times= 5;//定义局部变量times
        System.out.println("times的值为:"+times);//输出times的值
        System.out.println("times的值为："+Basic2.times);//输出静态变量
        System.out.println("常量PI的值："+ PI);
        System.out.println("m的值为："+m);
        System.out.println("int型变量times的值为："+times);
    }
}
