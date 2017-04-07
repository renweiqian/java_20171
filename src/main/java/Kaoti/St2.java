package Kaoti;

/**
 * Created by 任纹乾 on
 * 2017/4/1.
 */
public class St2 {
    public static void main(String[] args){
        StringBuffer n1 = new StringBuffer();
        String n2 = "abcSDSFD@#";
        char m[] = n2.toCharArray();
        for(int i = 0; i<n2.length(); i++){if(m[i]>=97){
            n1.append((m[i]+"").toUpperCase());
        }
        else{
            n1.append((m[i]+"").toLowerCase());
        }
        }
        System.out.println(n2);
        System.out.println(n1);
    }
}
