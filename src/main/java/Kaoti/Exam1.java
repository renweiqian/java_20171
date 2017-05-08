package Kaoti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 任纹乾 on
 * 2017/5/6.
 */
//利用 switch 语句将学生成绩分级,当从键盘中输入学生成绩在 100~90 范围时,输出“优 秀”
// ,在 89~80 范围时输出“良好”,在 79~70 范围时输出“中等”, 在 69~60 范围时输出
// “及格”,在 59~0 范围时输出“不及格”,在其他范围时输出“成绩输入有误!”。
public class Exam1 {
    public static void main(String[] args)throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println("输入成绩超出范围:");
        int n;
        n =Integer.parseInt(bufferedReader.readLine());
        if (n > 100 || n < 0) {
            System.exit(1);
        }
        switch (n/10){
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
                case 7:
                System.out.println("中等");
                break;
                case 6:
                System.out.println("及格");
                break;
                default:
                    System.out.println("不及格");

        }

    }

}
