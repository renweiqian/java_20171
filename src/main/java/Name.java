
public class Name {
    public static void main(String[] args) {
        char k1 = '1';
        char k2 = '1';
        System.out.println(k1 >> k2);
        int m = -1;
        int k = 1;
        System.out.println(m >>> k);
        char c1 = 'a';
        System.out.println(c1);
        char c2 = '\123';
        System.out.println(c2);
        char c3 = '\u4E00';
        System.out.println(c3);
        char c4 = '\t';
        System.out.println(c4);
        int x = 1;
        int y = 2;
        int z = x + y;
        System.out.println(z);
        double s1 = 1;
        double s2 = 2;
        System.out.println(s1 / s2);
        System.out.println(x * s2);
        System.out.println(s2 + +y);
        int i = 0;
        i += 1;
        i -= 2;
        i *= 3;
        i /= 4;
        i %= 5;
        System.out.println(i);
        boolean b = true;
        b &= false;
        System.out.println(b);
        i &= 1;
        System.out.println(i);
        int q = 1;
        int w = 2;
        int r = (q > w) ? 1 : 100;
        System.out.println(r);
        int grade = 55;
        if (grade >= 90) {
            System.out.println("优！！！");}
            else if (grade >= 70) {
               System.out.println("良好！！！");
           }
            else if (grade >= 60) {
            System.out.println("及格！！！");
        }
        else  {
            System.out.println("不及格！！！");
        }
    }

}
