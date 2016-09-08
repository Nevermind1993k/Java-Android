package Module_1_Basic.Lesson3_String;

/**
 * Created by Roman on 02.11.2015.
 */
public class Stroki {

    public static void main(String[] args) {

        String str = "Hello Java!";

        //Подстроки
        String str2 = str.substring(0, 5);//0-начало, 5-конец (без 5)
        System.out.println(str2);//Hello
        String str5 = str.substring(3);
        System.out.println(str5);//lo Java!
        String str3 = "Please " + str.substring(0, 3) + "p me!" +str.charAt(3);
        System.out.println(str3);

        //Сцепление строк
        int num = 15;
        String strNum = str + num;
        System.out.println(strNum);

        //Сравнение
        System.out.println("Hello java!".equals(str));//false (т.к. java - написано с маленькой буквы)
        System.out.println("Hello java!".equalsIgnoreCase(str));//true (.equalsIgnoreCase - игнорирует Большую букву/маленьку букву)
        System.out.println("Hello java!" ==str);//false (маленькая буква j)


        //Длина строки, кодовые точки и единицы
        String str4 = "Hello";
        int str4L = str4.length();
        int str4CodePoint = str.codePointCount(0, str4.length());
        System.out.println("Длина строки: " + str4L + '\n' + "Длина кодовых точек: " + str4CodePoint);
        char oneStr4 =str4.charAt(2); //кодовая единица на позиции 2

        System.out.println(str4.endsWith("lo")); // сравнивает окончание
        System.out.println(str4.indexOf("Hel")); //проверяет наличие
        System.out.println(str4.compareTo("Hello")); // сравнение строк


        /*
        //Операции со строками
        String s1 = "abCd";
        String s2 = "12345";
        String s3 = s1 + s2; // "abCd12345"
        String s4 = s1.substring(2); // "Cd"
        int x = s2.length(); // 5
        String s5 = s1.toUpperCase(); // "ABCD"
        char c = s1.charAt(0); // 'a'
        int pos = s1.indexOf("bC"); // 1
        String s6 = "aaacccddd".replace("ccc", "qqq"); // "aaaqqqddd"

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(c);
        System.out.println(pos);
        System.out.println(s6);
        */




    }
}
