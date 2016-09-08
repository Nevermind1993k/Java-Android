package Module_1_Basic.Lesson9_Math.HW_1811;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Roman on 19.11.2015.
 */
public class HW4_SortirovkaPolovinok {

    public static void main(String[] args) {

        //Ввести с клавиатуры массив из 10 чисел. Разбить его на 2 массива равной длинны.
        //отсортировать каждую из половинок и вывести их содержимое на экран.


        Scanner sc = new Scanner(System.in);
        System.out.print("Введите элементы массива: ");
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();                              // Заполнение
        }
        System.out.println("Массив: " + Arrays.toString(array));


        System.out.print("Первые 5 красавцев: ");
        for (int i = 0; i < array.length / 2; i++) {              // Первые 5
            Arrays.sort(array, 0, array.length / 2);
            System.out.print(array[i] + " ");
        }
        System.out.println();


        System.out.print("Последние 5 красавцев: ");
        for (int i = array.length / 2; i < array.length; i++) {   // Последние 5
            Arrays.sort(array, i, array.length);
            System.out.print(array[i] + " ");
        }


    }
}
