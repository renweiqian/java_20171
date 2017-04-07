package Kaoti;

/**
 * Created by 任纹乾 on
 * 2017/4/1.
 */
public class St3 {
    public static void main(String[] args) {
        String sr = "abcdafsgsgfd";
        String ar = "a";
        String br = "b";
        String cr = "c";
        String dr = "d";
        String er = "e";

        System.out.print("a" +"("+ search(sr, ar)+")" + ",");
        System.out.print("b" +"("+ search(sr, br) +")"+ ",");
        System.out.print("c" +"("+ search(sr, br) +")"+ ",");
        System.out.print("d" + "("+search(sr, br)+")" + ",");
        System.out.print("e" + "("+search(sr, br)+")" + ",");

    }

    public static int search(String sr, String ar) {
        int a = sr.length();
        int b = sr.replaceAll(ar, "").length();
        return a - b;
    }
}