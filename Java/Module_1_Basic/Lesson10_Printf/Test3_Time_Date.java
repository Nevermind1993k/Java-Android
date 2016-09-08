package Module_1_Basic.Lesson10_Printf;

import java.util.Date;

/**
 * Created by Roman on 19.11.2015.
 */
public class Test3_Time_Date {

    public static void main(String[] args) {

        System.out.printf("%1$tT %1$ta %1$td %1$tB \n", new Date());
        System.out.printf("%1$s %2$ta %2$td %2$tB %2$tY \n", "Сегодня: " , new Date());
        System.out.printf("%1$s %2$tj %3$s \n", "Сегодня: ", new Date()," день года !" );


    }
}
