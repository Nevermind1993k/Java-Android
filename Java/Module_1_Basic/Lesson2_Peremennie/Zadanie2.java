package Module_1_Basic.Lesson2_Peremennie;

import java.util.Scanner;

/**
 * Created by Roman on 05.11.2015.
 */
public class Zadanie2 {

    public static void main(String[] args) {

        //**********************Классное задание на ввод с клавы 2*************************
        //Прочитать с консоли 2-а числа и вывести результат для операторов: + -* /.

        Scanner scannerTask = new Scanner(System.in);

        int a, b;
        System.out.println("Введите число 1 и число 2: ");
        a = scannerTask.nextInt();
        b = scannerTask.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
