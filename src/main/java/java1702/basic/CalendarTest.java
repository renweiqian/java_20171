package java1702.basic;

import java.util.Calendar;

/**
 * Created by 任纹乾 on
 * 2017/3/23.
 */
//输出某年每月的日历
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 0, 8);
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

    }
}
;