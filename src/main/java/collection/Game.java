package collection;

/**
 * Created by 任纹乾 on
 * 2017/3/28.
 */

public class Game{
    private static final char[] COLORS = {'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        char[][] square = new char[10][10];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                square[i][j] = COLORS[(int) (Math.random() * 6)];
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}