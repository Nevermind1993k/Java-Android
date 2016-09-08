package Module_1_Basic.Lesson4_Sb;

/**
 * Created by Roman on 08.11.2015.
 */
public class Zadanie1v2 {

    public static void main(String[] args) {

        //**********Вариант 2*********
        String str = "Я сейчас изучаю StringBuilder!";
        String str2 = "изучаю";
        String str3 = " методы";

        StringBuilder strbuild = new StringBuilder();
        strbuild.append(str); // добавили нашу строку str в билдер

        int str2Int = str2.length(); //узнали длину слова "изучаю" (6) и занесли значение в str2Int
        int str2Int2 = str.indexOf(str2); //Проверили на наличие слова "изучаю" в строке str (9)
        int pos = str2Int2 + str2Int; //Позиция (9)+(6) =(15)

        strbuild.insert(pos, str3); //После нашей позиции (15) добавили str 3 - "методы"
        System.out.println(strbuild);

        //Удалить "!";
        int str2Int3 = strbuild.lastIndexOf("!");
        strbuild.deleteCharAt(str2Int3);
        String strFinal = strbuild.toString();//?

        System.out.println(strFinal.trim());
    }
}
