package Module_2_OOP.Lesson3_Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Roman on 25.11.2015.
 */
public class Test7_perevod {
    public static void main(String[] args) {

        //Перевод даты из GregorianCalendar в Date
        GregorianCalendar cal = new GregorianCalendar(2015, 05, 19);
        Date day = cal.getTime();
        System.out.println(day);

        //Перевод даты из Date в GregorianCalendar
        long d = 403231213974L;
        Date day2 = new Date(d);
        System.out.println(day2);
        GregorianCalendar cal2 = new GregorianCalendar();
        cal2.setTime(day2);
        int cal2Year = cal2.get(Calendar.YEAR);
        System.out.println(cal2Year);
    }
}
