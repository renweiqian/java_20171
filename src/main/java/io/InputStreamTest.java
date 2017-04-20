package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 任纹乾 on
 * 2017/4/18.
 */
public class InputStreamTest {
    public static void main(String[] arge) {
        try {
            FileInputStream inputStreamTest = new FileInputStream("test");
            int i;
            while ((i = inputStreamTest.read()) != -1) {
                System.out.print((char) i);
            }
            }catch(IOException e){
                e.printStackTrace();
            }

        }


}
