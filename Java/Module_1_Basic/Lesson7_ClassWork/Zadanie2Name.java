package Module_1_Basic.Lesson7_ClassWork;

/**
 * Created by Roman on 13.11.2015.
 */
public class Zadanie2Name {

    public static void main(String[] args) {

        //Написать программку которая из текста «сиДОРенко ИваН сТЕпановИЧ»
        //сделает текст «Сидоренко Иван Степанович»
        //и выдаст инициалы: «С. И. С.».

        //по пробелам

        String str = "сиДОРенко ИваН сТЕпановИЧ";
        str = str.toLowerCase();
        System.out.println(str);

        String first = str.substring(0, 1); // Вырезали 1й символ из строки
        first = first.toUpperCase();        // Подняли его

        StringBuilder sb = new StringBuilder(str);
        sb = sb.deleteCharAt(0);
        sb = sb.insert(0, first);           // Заменили 1й символ из строки(s1) на first
        System.out.println(sb);

        int a = str.length();               // Длина строки 25
        int b = str.indexOf(' ');           // Первый пробел на 9 позиции








    }
}
