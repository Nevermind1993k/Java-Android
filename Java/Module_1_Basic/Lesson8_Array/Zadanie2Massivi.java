package Module_1_Basic.Lesson8_Array;

import java.util.Arrays;

/**
 * Created by Roman on 17.11.2015.
 */
public class Zadanie2Massivi {

    public static void main(String[] args) {

        //Заполнить массив числами от 50 до 1.Вывести суму и среднеарифметическое.

        int a[] = new int[50];              // Массив на 50 чисел
        int b = 50;                         // Для заполнения
        int sum = 0;                        // Сума

        // Заполнение
        for (int i = 0; i < 50; i++) {
            a[i] = b;                       // a[0] = 50, a[1] = 49 ....... a[49] = 1
            b--;
        }
        System.out.println(Arrays.toString(a));


        // Сума
        for (int i = 0; i < 50; i++) {
            sum += a[i];                    // Сума
        }
        System.out.println(sum);


        // Среднеарифметическое
        double SredneArifmet = sum / 50;
        System.out.println(SredneArifmet);
    }
}
