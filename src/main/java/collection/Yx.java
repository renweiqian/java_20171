package collection;

/**
 * Created by 任纹乾 on
 * 2017/3/28.
 */
public class Yx {
    public static void main(String[] args) {
        int[][] ints = new int[5][7];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i + j;
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
