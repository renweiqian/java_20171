package Kaoti;

import java.util.Arrays;

/**
 * Created by 任纹乾 on
 * 2017/4/1.
 */
public class St4 {
    public static void main(String[] args) {
        int[] a = {89,90,77,87,66,54,328,890,99};
        int[] b = {65,72,12,77,2,96,54,27,89};
        int[] c = new int[3 ];
        int d = 0;
        for(int x=0;x<a.length;x++){
            for(int y=0;y<b.length;y++){
                if(a[x]==b[y]){
                    c[d]=a[x];
                    d++;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }

}
