package Module_2_OOP.Lesson3_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Roman on 25.11.2015.
 */
public class Test2_FormatDate {
    public static void main(String[] args) {
        // Переменная с текущими миллисекундами
        long t = System.currentTimeMillis();
        System.out.println(t);

        //Создание нового обьекта Date
        Date day = new Date(t);
        System.out.println(day);

        //Создание обьекта SimpleDateFormat с описанием шаблона вывода
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss | dd:MM:yy"); // создаем шаблон

        //Создание форматированной строки
        String sdfDay = sdf.format(day);
        System.out.println(sdfDay);
    }
}
