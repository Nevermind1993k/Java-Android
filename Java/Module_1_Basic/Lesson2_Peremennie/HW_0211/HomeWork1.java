package Module_1_Basic.Lesson2_Peremennie.HW_0211;

import java.util.Scanner;

/**
 * Created by Roman on 02.11.2015.
 */
public class HomeWork1 {

    public static void main(String[] args) {


        //********ДЗ Площадь прямоугольника в м, см , км**************


        Scanner scannerHome = new Scanner(System.in);

        System.out.println("Программа подсчёта площади прямоугольника в (м),(см),(км)\n");
        System.out.println("Введите параметры двух сторон прямоугольника в (м) ");

        int a;
        double b, S;
        System.out.println("Введите сторону а в (м): ");
        a = scannerHome.nextInt();
        System.out.println("Введите сторону b в (м): ");
        b = scannerHome.nextDouble();

        S = a * b;

        System.out.println("Площадь прямоугольника в (м) = " + S);
        System.out.println("Площадь прямоугольника в (см) = " + S * 100);
        System.out.println("Площадь прямоугольника в (км) = " + S / 1000);


    }
}
