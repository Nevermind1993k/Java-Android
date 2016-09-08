package Module_2_OOP.Lesson3_Date;

import java.util.GregorianCalendar;

/**
 * Created by Roman on 25.11.2015.
 */
public class Zadanie2 {
    public static void main(String[] args) {

        //Посчитать разницу в днях между днями рождения ваших родственников.

        GregorianCalendar dr1 = new GregorianCalendar(1990, 10, 24);
        GregorianCalendar dr2 = new GregorianCalendar(1990, 10, 20);

        long long1 = dr1.getTimeInMillis();
        long long2 = dr2.getTimeInMillis();

        long result = (long2 - long1) / 1000 / 60 / 60 / 24; //1k ms, 60sec, 60min, 24h
        System.out.println(result);


    }
}
