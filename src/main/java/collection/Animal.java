package collection;

/**
 * Created by 任纹乾 on
 * 2017/3/25.
 */
public class Animal implements Flying,Swiming {
    String name;
    double weight;
    char color;

    public String getName() {
        return name;
    }

    public double getSex() {
        return weight;
    }

    public char getAge() {
        return color;
    }


    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

class Cat  extends Animal{
    String eye;
    String ear;
    public void sleep() {
        System.out.println("sdfdf");
    }
    public void play() {
        System.out.println("miaoooo");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getSex() {
        return super.getSex();
    }

    @Override
    public char getAge() {
        return super.getAge();
    }
}

interface  Flying  {
    public  abstract void fly() ;

}
interface  Swiming  {
    public abstract void swim() ;
}

class E5 {
    public static void method(int x) {
        System.out.println("a:" + x);
        x++;
        System.out.println("b:"+ x);

    }

    public static void main(String[] args) {
        int i=0;
        System.out.println("c:"+ i);
        method(i);
        System.out.println("d:"+ i);
    }
}

