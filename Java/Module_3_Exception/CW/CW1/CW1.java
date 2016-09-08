package Module_3_Exception.CW.CW1;

import java.util.Arrays;

/**
 * Created by Roman on 07.12.2015.
 */
public class CW1 {
    public static void main(String[] args) {
        // Создать массив, заполнить его значениями от 10 до 100,
        // создать второй массив и заполнить его значениями от 0 до 9.
        // Через for перебрать все значения 1-го массива которые делятся без остатка на значения 2-го.
        // Предусмотреть соответствующие исключения.

        int[] a = new int[91];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 10;
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < b.length; i++) {
            b[i] = i;
        }
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                try {
                    if (a[i] % b[j] == 0) { System.out.println(a[i] + " нацело делеться на " + b[j]); }
                } catch (ArithmeticException e) {
                    System.out.println("на 0 делить нельзя");
                }
            }
        }
    }
}
