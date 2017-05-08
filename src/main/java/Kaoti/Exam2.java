package Kaoti;

/**
 * Created by 任纹乾 on
 * 2017/5/6.
 */
//编写一个实现方法重载的程序
 class Exam2 {

    public void pt(){
        System.out.println('Y');
    }
    public int pt(char c){
        return c;
    }
    public String pt(int i,char c){
        return c + "=" + i;
    }
    public static void main(String[] args){
        Exam2 t = new Exam2();
        t.pt();
        System.out.println(t.pt('Y'));
        System.out.println(t.pt(89,'Y'));
    }
}
