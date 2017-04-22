package collection;

/**
 * Created by asus on 2017/3/15.
 */
public class Hanoi {//类名、父类
    int money;//域名
    public void coding(){//方法
        //中间有一个隐形类的默认方法//
        System.out.println("Hanoi is coding");//输出方法
    }
}
class Sadas extends Hanoi{//子类
}
class ExtndsText{//类
    public static void main(String[] args) {//主方法
                    Hanoi hanoi = new Hanoi();//对象
        System.out.println(hanoi.money);//输出调用的域，引用所在域的方法
        hanoi.coding();//输出调用方法
        Sadas sadas = new  Sadas();//对象
        System.out.println(sadas.money);//输出调用的域
        sadas.coding();//输出调用的方法

    }
}
