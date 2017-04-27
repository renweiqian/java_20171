package Kaoti;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by 任纹乾 on
 * 2017/4/22.
 */
//编写一个程序,其功能是将两个文件的内容合并到一个文件中
//例如：1.txt 内容为 abc；2.txt 内容为 def；生成新文件3.txt 内容为 abcdef
public class Ks3 {
    public static void main(String[] args) {
        try {
            Writer writer1= new FileWriter("1.txt");
            Writer writer2= new FileWriter("2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
