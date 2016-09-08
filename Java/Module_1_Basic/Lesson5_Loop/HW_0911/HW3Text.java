package Module_1_Basic.Lesson5_Loop.HW_0911;

/**
 * Created by Roman on 11.11.2015.
 */
public class HW3Text {

    public static void main(String[] args) {

        //Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е и 3-е слова местами и вывести на экран результат.

        String str = "Слово1 Слово2 Слово3";
        String arrStr[] = str.split(" "); //Разбил массив по пробелам
        String finalStr = "";
        for (int i = arrStr.length - 1; i >= 0; i--) {
            finalStr += arrStr[i] + " ";
        }
        finalStr = finalStr.trim();// удалил лишние пробелы
        System.out.println(finalStr);


    }


}
