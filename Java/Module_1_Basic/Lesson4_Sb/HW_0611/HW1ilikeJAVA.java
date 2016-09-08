package Module_1_Basic.Lesson4_Sb.HW_0611;

/**
 * Created by Roman on 08.11.2015.
 */
public class HW1ilikeJAVA {

    public static void main(String[] args) {

//Дана строка: «Мне нравится Джава, потому кроме домашних заданий я читаю книги по Джава и смотрю уроки по Джава !».
//Заменить все слова «Джава» на «Java», без использования метода .replace().

        String str = "Мне нравится Джава, потому кроме домашних заданий я читаю книги по Джава и смотрю уроки по Джава!";
        String s1 = "Джава";

        int a = str.indexOf(s1); // 13
        int b = s1.length(); // 5

        StringBuilder sb = new StringBuilder(str);
        sb.delete(a, a + b); // от 13 до 13+5
        sb.insert(a, "Java"); // на место 13, "Java"

        a = sb.indexOf(s1); // 66 Ищём дальше слово "Джава"
        sb.delete(a, a + b);
        sb.insert(a, "Java");

        a = sb.indexOf(s1); // 89
        sb.delete(a, a + b);
        sb.insert(a, "Java");


        System.out.println(sb);


    }
}
