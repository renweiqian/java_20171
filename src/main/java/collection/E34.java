package collection;

/**
 * Created by 任纹乾 on
 * 2017/3/20.
 */
//	打印出杨辉三角形（要求打印出10行如下图）
   // 	   1
//    1	  2	   1
// 1	3	3	1 .........（略）

public class E34 {
        public static void main(String[] args){

            int n = 20;
            int[] last = new int[n];
            for (int i = 0; i < n; ++i)
                last[i] = 1;
            int[] current = last.clone();
            System.out.print("1\n1 1\n");

            for (int i = 3; i <= n; ++i) {
                for (int j = 1; j < i - 1; ++j) {
                    current[j] = last[j] + last[j - 1];
                }
                print(current, i);

                int[] t = current;
                current = last;
                last = t;
            }

        }

        static void print(int[] array, int n) {
            for (int i = 0; i < n; ++i)
                System.out.print(array[i] + " ");
            System.out.println();
        }


}
