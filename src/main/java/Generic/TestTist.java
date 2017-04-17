package Generic;

/**
 * Created by 任纹乾 on
 * 2017/4/17.
 */
public class TestTist {

    public static void main(String[] args) {

        try {

            System.out.println("hello".charAt(0));

            System.out.println((new int[]{1, 2, 3})[0]);

            System.out.println(1 / 1);

            System.out.println(Integer.valueOf("123"));

            String s = "hi";

            //s = null

            System.out.println(s.toUpperCase());

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("test");
    }
}
