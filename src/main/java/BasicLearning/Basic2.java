package BasicLearning;

/**
 * Created by 任纹乾 on
 * 2017/3/31.
 */
public class Basic2 {//新建类
    static   int times = 3 ;//定义成员变量times//定义的静态变量
    public static void main(String[] args) {//主方法
        int times= 4 ;//定义局部变量times
        System.out.println("times的值为:"+times);//输出times的值
        System.out.println("times的值为："+Basic2.times);//输出静态变量
    }
}
