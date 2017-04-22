package collection;

/**
 * Created by asus on 2017/3/16.
 */
public class E21 {
    public long get(int n){
        if(n == 1){
            return 1;
        }else {
            return n * get(n - 1);
        }
    }

    public static void main(String[] args) {
        E21 e21 = new E21();
        System.out.println(e21.get(3));

    }
}
