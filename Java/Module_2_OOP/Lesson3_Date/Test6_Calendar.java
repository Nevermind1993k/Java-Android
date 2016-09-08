package Module_2_OOP.Lesson3_Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Roman on 25.11.2015.
 */
public class Test6_Calendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("Year: " +c.get(Calendar.YEAR));
        System.out.println("Month: " + c.get(Calendar.MONTH));

        GregorianCalendar birthday = new GregorianCalendar(1999, Calendar.OCTOBER, 10);
        GregorianCalendar birthday2 = new GregorianCalendar();

        int year = birthday2.get(Calendar.YEAR);
        int month = birthday2.get(Calendar.MONTH); // месяца начинаются с 0
        System.out.println(year + " " + month);

        GregorianCalendar dayToHappy = new GregorianCalendar();
        dayToHappy.set(Calendar.YEAR, 2015);
        dayToHappy.set(Calendar.MONTH, 10);
        dayToHappy.set(Calendar.DATE, 15);

        dayToHappy.add(Calendar.MONTH, -2); // сдвиг на 2 месяца
        dayToHappy.add(Calendar.DATE, 16); // сдвиг на 16 дней

        GregorianCalendar dayToHappy2 = new GregorianCalendar();
        dayToHappy2.set(2015, Calendar.JULY, 31);
        System.out.println(dayToHappy.equals(dayToHappy2));
    }
}
