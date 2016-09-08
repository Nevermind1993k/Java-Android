package Module_1_Basic.Lesson3_String;

import java.util.Scanner;

/**
 * Created by Roman on 05.11.2015.
 */
public class Zadanie1 {

    public static void main(String[] args) {

        //*************Задание**********
        //Создаем 3 строки (консольно–через Scanner),
        //соединяем 2-е из них, сравниваем с 3-й,
        //разъединяем строки в первоначальном состояние.
        //Считаем символы, во всех строках.
        //После каждой операции результат выводим на экран.


        Scanner scanner1 = new Scanner(System.in);

        String s1, s2, s3, s4;
        System.out.println("Введите строку 1: ");
        s1=scanner1.nextLine();
        System.out.println("Введите строку 2: ");
        s2=scanner1.nextLine();
        System.out.println("Введите строку 3: ");
        s3=scanner1.nextLine();

        System.out.println("строка 1 + строка 2 = ");
        s4 = s1 + s2;
        System.out.println(s4);

        System.out.println("Сравнение строки 1+2 с 3:");
        boolean result = s4.equals(s3);
        System.out.println(result);

        System.out.println("Разьединение 1: ");
        String s5 = s4.substring(0, s1.length());
        System.out.println(s5);
        System.out.println("Разьединение 2: ");
        String s6= s4.substring(s1.length());
        System.out.println(s6);

        System.out.println("Считаем символы: ");
        int x, y, z;
        x = s1.length();
        y = s2.length();
        z = s3.length();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
