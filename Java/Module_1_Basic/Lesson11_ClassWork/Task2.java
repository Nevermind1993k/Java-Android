package Module_1_Basic.Lesson11_ClassWork;

import java.util.Arrays;

/**
 * Created by Roman on 20.11.2015.
 */
public class Task2 {

    public static void main(String[] args) {

        //Дано фразу "I love JAVA!", раздробить ее посимвольно в массив,
        //вывести результат, обратно собрать в одну фразу

        String str = "I love JAVA!";                // Фраза
        System.out.println(str);

        char [] ch = str.toCharArray();             // Посимвольно
        System.out.println(Arrays.toString(ch));

        String str1 = new String(ch);               // Фраза
        System.out.println(str1);
    }
}
