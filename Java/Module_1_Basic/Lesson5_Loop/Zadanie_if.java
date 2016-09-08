package Module_1_Basic.Lesson5_Loop;

import java.util.Scanner;

/**
 * Created by Roman on 09.11.2015.
 */
public class Zadanie_if {

    public static void main(String[] args) {

        /*
        Написать программку которая будет запрашивать 3/4/5 числа и показывать минимальное из них.
         */

        int a, b, c, d, e;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        a = scanner1.nextInt();
        System.out.println("Введите число 2: ");
        b = scanner1.nextInt();
        System.out.println("Введите число 3: ");
        c = scanner1.nextInt();
        System.out.println("Введите число 4: ");
        d = scanner1.nextInt();
        System.out.println("Введите число 5: ");
        e = scanner1.nextInt();

        if (a <= b && a <= c && a <= d && a <= e) System.out.println("Минимальное число: " +a);
        else if (b <= a && b <= c && b <= d && b <= e) System.out.println("Минимальное число: " +b);
        else if (c <= a && c <= b && c <= d && c <= e) System.out.println("Минимальное число: " +c);
        else if (d <=a && d<=b && d<=c && d<=e) System.out.println("Минимальное число: " +d);
        else if (e <=a && e <=b && e <=c && e<=d) System.out.println("Минимальное число: " +e);

    }
}
