package collection;

/**
 * Created by 任纹乾 on
 * 2017/3/28.
 */
public class _2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
