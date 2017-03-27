/**
 * Created by 任纹乾 on
 * 2017/3/22.
 */
public class StaicTest {
    //staic静态
    public static void main(String[] args) {
        Mankind tom = new Mankind();
        tom.name = "Tom";
        tom.age = 18;
        tom.married = true;
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.married);

        System.out.println("---------------");

        Mankind jerry = new Mankind();
        jerry.name ="Jerry";
        jerry.age = 16;
        jerry.married = false;
        System.out.println(jerry.name);
        System.out.println(jerry.age);
        System.out.println(jerry.married);
    }
}
class Mankind{
    public String name;
    public int age ;
    public static boolean married;
}