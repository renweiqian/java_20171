package BasicLearning;

/**
 * Created by 任纹乾 on
 * 2017/4/1.
 */
    //class = fields + methods(function)
public class Basics4{//类
   private String name;//定义一个私有的域
   private  char gender;
   private  int age;
   private double height;
   private  double geight;
   public String study(int studyTme){//成员方法
       System.out.println(name + "学习了" + studyTme +"小时");
       return "作业";
   }
    //void\空的；无效的；
    public void work(boolean b){
       if  (b){
           return;
       }
       //...
        // ...
        // ...
        if (b){

        }else{

        }
    }
    public void eat(String foods,double amount){
        System.out.println(name + "吃了" + amount + foods);

    }
    public int  sleep(boolean isPlayGame){
        return isPlayGame ? 1 : 8;
    }
}
