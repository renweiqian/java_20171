package java1702.basic;

import java.util.regex.Pattern;

/**
 * Created by 任纹乾 on
 * 2017/4/27.
 */
public class Matcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("l");
        java.util.regex.Matcher matcher = pattern.matcher("hello");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
