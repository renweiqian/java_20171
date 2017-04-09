package Kaoti;

/**
 * Created by 任纹乾 on
 * 2017/4/8.
 */
//将一个数组中值为0的项去掉,将不为0的值存入一个新的数组,比如:
 //       　　int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
   //     　　生成的新数组为:
    //    　　int b[]={1,3,4,5,6,6,5,4,7,6,7,5}
public class Stm2 {
    public static void main(String arg[]){
        int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int b[]=new int[a.length];
        int c=0;
        for(int d=0;d<a.length;d++){
            if(a[d]!=0){
                b[c]=a[d];
                System.out.print(b[c]+"\t");
                c++;
            }
        }
    }
}

