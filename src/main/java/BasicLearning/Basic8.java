package BasicLearning;

/**
 * Created by 任纹乾 on
 * 2017/4/8.
 */
public class Basic8 {
    public static void main(String[] args) {
        StringBuffer stringBuffer =new StringBuffer("Holle");
        stringBuffer.append("world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(5,6));
        System.out.println(stringBuffer.insert(5,","));
        System.out.println(stringBuffer.insert(stringBuffer.length(),"!"));
        System.out.println(stringBuffer.reverse());
        stringBuffer.reverse().setCharAt(0,'h');
        System.out.println(stringBuffer);
    }
}
