package collection;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by 任纹乾 on
 * 2017/4/18.
 */
public class CheckedExceptionTest {
    private static  void method() throws FileNotFoundException{
        System.out.println("text...");
        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        System.out.println("input a file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "r");
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.err.println("file ont found");
           // test();
        }
    }


}
