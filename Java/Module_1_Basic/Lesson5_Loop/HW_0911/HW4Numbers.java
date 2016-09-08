package Module_1_Basic.Lesson5_Loop.HW_0911;

import java.util.Scanner;

/**
 * Created by Roman on 11.11.2015.
 */
public class HW4Numbers {

    public static void main(String[] args) {

        //Написать программку которая постоянно запрашивает числа, а после ввода цифры «0» она выводит суму этих чисел.

        Scanner sc = new Scanner(System.in);
        int y = 0;

        do {
            int x = sc.nextInt();

            y = y + x;
            if (x == 0) {
                System.out.println(y);
                break;
            }
        } while (true);





    }
}
