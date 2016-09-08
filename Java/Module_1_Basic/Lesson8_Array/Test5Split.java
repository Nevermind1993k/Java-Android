package Module_1_Basic.Lesson8_Array;

import java.util.Arrays;

/**
 * Created by Roman on 17.11.2015.
 */
public class Test5Split {

    public static void main(String[] args) {

        String str = "I love Java!";

        //split(символ отрезания слова, количество слов)
        String[] arrStr = str.split(" "); // Разбивает массив до " " (Заносит всё что до " " в отдельный массив)
        String[] arrStr2 = str.split(" ", 2); // Разбить на 2 части

        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrStr2));

        String str2 = "tel.: 234-56-78, tel.: 234-56-89";
        String[] arrStr3 = str2.split(":");
        System.out.println(Arrays.toString(arrStr3));

    }
}
