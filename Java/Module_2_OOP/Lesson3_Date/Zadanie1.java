package Module_2_OOP.Lesson3_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Roman on 25.11.2015.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        //Отформатировать вывод 5-ти дат в разном виде.
        Date day1 = new Date(); // текущая дата

        SimpleDateFormat shablon1 = new SimpleDateFormat("dd MMMM y");
        SimpleDateFormat shablon2 = new SimpleDateFormat("dd MMM y G");
        SimpleDateFormat shablon3 = new SimpleDateFormat("dd MM yy | HH mm ss");
        SimpleDateFormat shablon4 = new SimpleDateFormat("dd.MM.yy | K a:m:s");
        SimpleDateFormat shablon5 = new SimpleDateFormat("ss mm HH dd D ww MM yyyy ");

        String shablon1day1 = shablon1.format(day1);
        System.out.println(shablon1day1);

        String shablon2day1= shablon2.format(day1);
        System.out.println(shablon2day1);

        String shablon3day1 = shablon3.format(day1);
        System.out.println(shablon3day1);

        String shablon4day1= shablon4.format(day1);
        System.out.println(shablon4day1);

        String shablon5day1 = shablon5.format(day1);
        System.out.println(shablon5day1);



    }
}
