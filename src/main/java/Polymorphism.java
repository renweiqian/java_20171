import java.util.Calendar;
import java.util.concurrent.Callable;

/**
 * Created by asus on 2017/3/17.
 */
public class Polymorphism {
    public static void main(String[] args) {
        CalendarTest calendarTest = new CalendarTest();
        System.out.println(calendarTest.add(1,2));
        System.out.println(calendarTest.add(1d,2));
     }
}
class CalendarTest{
    public int add(int x,int y){
        return x + y;
    }
    public double add(double x, double y){
        return x + y;
    }
    public double add(int x, double y){
        return 0;
    }
    public double add(double x, int y){
        return 1d;


    }

}