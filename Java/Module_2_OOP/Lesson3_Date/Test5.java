package Module_2_OOP.Lesson3_Date;

import java.util.Date;

/**
 * Created by Roman on 25.11.2015.
 */
public class Test5 {
    public static void main(String[] args) {
        Date happyDay = new Date(); // наш сегодняшний день
        System.out.println(happyDay);

        //long d - количеством милисекунд
        //прошедших с 1 января 1970 года

        long d = 403231213974L;
        Date happyDay2 = new Date(d); //happyDay2=403231213974L
        System.out.println(happyDay2);

        System.out.println("Method.before: " + happyDay.before(happyDay2)); //Сравнивает дату1 и дату2
        System.out.println("Method.getTime()" + happyDay.getTime()); //переводит нашу сегодняшнюю дату в Long
        happyDay.setTime(-1353453405345L); // изменли happyDay
        System.out.println("happyDay теперь: " + happyDay);

        long day1 = 1438328130217L;
        Date happyDay3 = new Date(day1); // запилили дату3 через лонг
        System.out.println(happyDay3);
        System.out.println("Method.compareTo " + happyDay.compareTo(happyDay3)); //0-если равные

        System.out.println();

        System.out.println("Method .before: " +happyDay.before(happyDay2));
        System.out.println("Method .compareTo " +happyDay.compareTo(happyDay2));
        System.out.println("Method .getTime() " + happyDay.getTime());
        happyDay.setTime(-1353453405345L);
        System.out.println(happyDay);

    }
}
