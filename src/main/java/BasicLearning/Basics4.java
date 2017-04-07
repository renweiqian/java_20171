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
   public Basics4(){//构造方法

    }

    public Basics4(String name, char gender, int age, double height, double geight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.geight = geight;
    }
    public static void main(String[] args) {//主方法
        Basics4 basics4 = new Basics4("tom",'女',18,1.7,65);
        System.out.println(basics4.gender);
        System.out.println(basics4.name);
        System.out.println(basics4.age);
        System.out.println(basics4.height);
        System.out.println(basics4.geight);

    }
   public String study(int studyTme){//成员方法
       System.out.println(name + "学习了" + studyTme +"小时");
       return "作业";
   }
    //void\空的；无效的；没有返回值
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
        System.out.println(name + "吃了" + amount + foods);;

    }
    public int  sleep(boolean isPlayGame){
        return isPlayGame ? 1 : 8;
    }
}
