package reflect;

/**
 * Created by 任纹乾 on
 * 2017/5/4.
 */
public class AccessibleTest {
    public static void main(String[] args) {
        Person  person = new  Person(29);
        System.out.println(person.age);
    }
}
class Person{
    private int age;
    public Person(int age){
        this.age =age;
    }
}
