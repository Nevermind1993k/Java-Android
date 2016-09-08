package Module_1_Basic.Lesson2_Peremennie.HW_0211;

import java.util.Scanner;

/**
 * Created by Roman on 02.11.2015.
 */
public class HomeWork2 {

    public static void main(String[] args) {

        //********ДЗ Обьем аквариума в м, см**************

        Scanner scannerHome = new Scanner(System.in);

        System.out.println("Программа подсчёта обьема аквариума в (м) и (см)\n");
        System.out.println("Введите параметры трёх сторон аквариума в (см) ");

        double a, b, c, V;

        System.out.println("Введите сторону а в (см): ");
        a = scannerHome.nextDouble();
        System.out.println("Введите сторону b в (см): ");
        b = scannerHome.nextDouble();
        System.out.println("Введите сторону c в (см): ");
        c = scannerHome.nextDouble();

        V = a * b * c;

        System.out.println("Обьем аквариума в (см) = " + V);
        System.out.println("Обьем аквариума в (м) = " + V / 100);

    }
}
