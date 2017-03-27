package java1702.basic;

/**
 * Created by 任纹乾 on
 * 2017/3/21.
 */
public class E16 {
    public static void main(String[] args) {
        for (int x = 1; x <=9;x++){
            for (int y =1; y <= x; y++){
                System.out.print(x+ "*" +y+ "=" + x * y +"\t");
            }
            System.out.println();
        }
    }
}
