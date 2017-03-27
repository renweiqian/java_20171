/**
 * Created by asus on 2017/3/16.
 */
public class E22 {
    public int get(int n){
        if (n == 1){
            return 1;
        }else {
            return n * get(n - 1);
        }
    }

    public static void main(String[] args) {
       E22 e22 = new E22();
       System.out.println(e22.get(16));

    }
}
