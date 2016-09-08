package Module_2_OOP.Lesson3_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/**
 * Created by Roman on 25.11.2015.
 */
public class Test3_Date_in {
    public static void main(String[] args) {
        //Пример ввода даты и времени
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat stf = new SimpleDateFormat("d MM yy");
        System.out.println("Input Date");
        String str = sc.nextLine();

        try {
            Date dd = stf.parse(str);
            System.out.println(dd);
        }

        catch (ParseException e) {
            System.out.println("Wrong input");
        }

    }
}
