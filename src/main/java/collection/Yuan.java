package collection;

/**
 * Created by asus on 2017/3/14.
 */
public class Yuan {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int qian = i/1000;
            int bai = i / 100 % 10;
            int shi = i / 10 % 10;
            int ge = i % 10;
            if (i == qian*qian*qian*qian+bai * bai * bai * bai + shi * shi * shi * shi + ge * ge * ge * ge) {


                System.out.println(i);
            }
        }
    }
}
