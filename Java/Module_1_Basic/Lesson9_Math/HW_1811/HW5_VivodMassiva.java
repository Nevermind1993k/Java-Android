package Module_1_Basic.Lesson9_Math.HW_1811;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Roman on 19.11.2015.
 */
public class HW5_VivodMassiva {

    public static void main(String[] args) {

        //Создать массив, элементы которого вводятся с клавиатуры (и размер также).
        //Вывод нужного элемента по его индексу на консоль.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = sc.nextInt();

        int array[] = new int[a];                      //Размер

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите элементы массива: ");

        for (int i = 0; i < a; i++) {
            array[i] = sc2.nextInt();                   // Элементы
        }
        System.out.println(Arrays.toString(array));

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите индекс массива: ");
        int c = sc3.nextInt();
        System.out.println("Элемент: " + array[c]);      // Вывод по индексу


    }
}
