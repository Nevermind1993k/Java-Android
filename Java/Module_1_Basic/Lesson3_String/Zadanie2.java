package Module_1_Basic.Lesson3_String;

/**
 * Created by Roman on 05.11.2015.
 */
public class Zadanie2 {

    public static void main(String[] args) {

        //*************Задание 2**********
        //Вывести только цифры
        String s1 = "тел. : 252-74-55";
        String s2 = (s1.replaceAll("\\D", ""));
        System.out.println("\"" + s2 + "\"");
    }
}
