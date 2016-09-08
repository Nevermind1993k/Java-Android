package Module_1_Basic.Lesson7_ClassWork;

/**
 * Created by Roman on 13.11.2015.
 */
public class Zadanie1invertTEXT {

    public static void main(String[] args) {

        //Написать программку которая инвертирует введенный текст.
        //без reverse

        //Есть строка, прогнать её через for

        String str = "Добрый Вечер";//11
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}
