package Module_1_Basic.Lesson4_Sb;

/**
 * Created by Roman on 06.11.2015.
 */
public class Zadanie1 {

    public static void main(String[] args) {

        //Ввести с консоли строку «Я сейчас изучаю StringBuilder!»,
        //вставить после слова «изучаю» слово «методы»,
        //удалить «!»,
        //узнать длину фразы.
        //После каждого этапа делать печать фразы.

        /*Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Ввели строку с клавы
        */

        String str = "Я сейчас изучаю StringBuilder!";

        String s1 = " методы";
        String s2 = "изучаю";
        int a = str.indexOf(s2); // показывает место в строке слова "изучаю" (9)
        int b = s2.length(); // длина слова "изучаю" (6)

        StringBuilder sb = new StringBuilder(str); // создали Стрингбилдер с именем sb
        System.out.println(sb); // вывели конструктируваную строку

        sb.insert(a + b, s1); // после 15 символа вставляем s1
        System.out.println(sb);

        //Удалить "!";
        int c = sb.indexOf("!"); //место в строке символа '!'
        sb.deleteCharAt(c);
        System.out.println(sb);









    }
}
