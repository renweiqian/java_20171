package BasicLearning;

/**
 * Created by 任纹乾 on
 * 2017/4/7.
 */
public class Basic7 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int sum = 0;
        System.out.println("一维数组中个元素的和是：");
        for (int i = 0; i < 10; i++) {
            if (i == 10) {
                System.out.println(num[i]);
            }
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
