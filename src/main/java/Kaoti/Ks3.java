package Kaoti;

import java.io.*;

/**
 * Created by 任纹乾 on
 * 2017/4/22.
 */
//编写一个程序,其功能是将两个文件的内容合并到一个文件中
//例如：1.txt 内容为 abc；2.txt 内容为 def；生成新文件3.txt 内容为 abcdef
public class Ks3 {
    public static void main(String[] args)throws IOException
    {
        File file1=new File("c:\\1.txt");
        File file2=new File("c:\\2.txt");
        FileInputStream fis=new FileInputStream(file2);
        InputStreamReader isr=new InputStreamReader(fis);
        FileOutputStream fos=new FileOutputStream(file1,true);
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        int c;
        while((c=isr.read())!=-1)
        {
            osw.write((char)c);
        }
        isr.close();
        osw.close();
    }

}
