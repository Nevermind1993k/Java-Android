package Module_1_Basic.Lesson8_Array;

import java.util.Arrays;

/**
 * Created by Roman on 17.11.2015.
 */
public class Test1Massiv {

    public static void main(String[] args) {

        char[] iLoveJava = {'i', 'L', 'o', 'v', 'e', 'J', 'a', 'v', 'a'};

        String str = new String (iLoveJava); //ссылка на массив
        System.out.println(str);

        String str2 = "I'm a programmer!";
        char[] ch = str2.toCharArray();// Разбить строку по символам
        System.out.println(Arrays.toString(ch));
    }
}
