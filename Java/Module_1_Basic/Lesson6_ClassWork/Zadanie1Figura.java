package Module_1_Basic.Lesson6_ClassWork;

import java.util.Scanner;

/**
 * Created by Roman on 12.11.2015.
 */
public class Zadanie1Figura {

    public static void main(String[] args) {

        /*Вывести на экран фигуру :
        **********
        *        *
        *        *
        **********
        Должны вводится 2 параметра: высота и ширина (int a=4, b=10;).
        */

        Scanner sc = new Scanner(System.in);

        int a = 4; // Высота
        int b = 10; // Ширина

        for (int i = 0; i < a; i++) {
            if (i == 0 || i == a - 1) { //внутренняя часть фигуры
                for (int j = 0; j < b; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if (i != 0 || i != a - 1) { // Если мы не внутри фигуры рисуем *
                System.out.print("*");
                for (int j = 0; j < b - 2; j++) { // 2 звезды по краям (стандартно)
                    System.out.print(" "); //внутри фигуры
                }
                System.out.println("*");

            }

        }

    }
}
