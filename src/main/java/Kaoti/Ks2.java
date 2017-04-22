package Kaoti;

/**
 * Created by 任纹乾 on
 * 2017/4/22.
 */
//编写一个正确处理的产生空指针异常的程序
public class Ks2 {
    public static void main(String[] args) {
            try {
                ((String) null).length();
            } catch (NullPointerException e) {
                System.out.println(".");
            }
    }
}
