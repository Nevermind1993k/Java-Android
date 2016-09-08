package Module_2_OOP.Lesson3_Date.HomeWork_2511;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Roman on 26.11.2015.
 */
public class HW_1 {
    public static void main(String[] args) {
        //Ввести с консоли дату. Сравнить ее с текущей датой в системе.
        //Вывести отличающиеся части (год, месяц) на экран.

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd MM yyyy");
        System.out.println("Введите dd mm yyyy:");

        int y = sc.nextInt(); // год
        int m = sc.nextInt(); // месяц
        int d = sc.nextInt(); // день
        GregorianCalendar cal1 = new GregorianCalendar(d, m, y);


        Date data1 = cal1.getTime();
        System.out.println("Дата 1: " +df.format(data1));


        Date data2 = new Date();
        System.out.println("Дата 2: " + df.format(data2));


        long result;


    }
}
