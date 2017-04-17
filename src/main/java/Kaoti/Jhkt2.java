package Kaoti;

/**
 * Created by 任纹乾 on
 * 2017/4/15.
 */
//找出字符串中出现次数最多的字母和出现的次数
public class Jhkt2 {
    public static void main(String[] args){
        String str = "afasgfasdgasdgafdjjfgjdghjghj";
        int count = 0;
        char res = getMostFrequencyChar(str, count);
        System.out.println("出现最多的字母是："+res);
    }

    public static char getMostFrequencyChar(String str, int count){
        char ret= ' ';
        int[] sum = new int[128];
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if((65 <= c && c <= 90) || (97 <= c && c <=122))
                sum[c]++;
        }
        for(int i=0; i<sum.length; i++)
            if(sum[i] > count)
            {
                count = sum[i];
                ret = (char) i;
            }
        System.out.println("出现的次数为："+ count +"次");
        return ret;
    }
}

