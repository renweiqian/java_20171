import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 任纹乾 on
 * 2017/4/20.
 */
public class InputStreamTest {
    public static void main(String[] arge){
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("");
            int i;
            while ((i = inputStream.read())!= -1){
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream !=null){
                try{
                    inputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
