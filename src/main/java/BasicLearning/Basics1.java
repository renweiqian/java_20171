package BasicLearning;

/**
 * Created by 任纹乾 on
 * 2017/3/31.
 */
public class Basics1 {
                                //整数类型( byte , short , int , long)
                    //数值型    //
                    //          //浮点类型（float , double）
    //基本数据类型 //字符型
                   //
                  //布尔型
//在java中有8种基本数据类型，其中6种是数值类型，另外两种分别是字符类型和布尔类型，
// 而6种数值类型中有4种整数类型，另外两种是浮点类型
    boolean v = true;//布尔类型
    float  c = 0.3f;//单精度浮点数
    double b = 0.2d;//双精度浮点数
    byte x = 48,y = -108, z;//字节            -128---127
    //定义一个byte型变量型，x.y.z,并赋值给x.y
    short g = 6;//短整型         -32768---32767
    int a = 1;//整型             -2147483648---2147483647
    long  d = 0;//长整型         -92233720336854775808---9223372036854775807
    char f = 8;//字符

    public static void main(String[] args) {//主方法
        byte  m = 124;//声明byte型变量并赋值
        short n = 32564;//声明short型变量并赋值
        int f = 45784612;//声明int型变量并赋值
        long g = 46789451L;//声明long型变量并赋值
        long  h = m + n + f +  g;//获得各数相加后的结果
        System.out.println("四种类型相加结果："+h);//将以上变量相加的结果输出
        float k1 = 13.23f;//定义float型变量
        double k2 = 4562.12d;//定义double型变量
        double k3 = 45678.1564;//定义double型变量
        double k4 = k1 + k2 + k3;//获得各数相加后的结果
        System.out.println("浮点相加结果："+k4);//将以上变量相加的结果输出

    }
}
