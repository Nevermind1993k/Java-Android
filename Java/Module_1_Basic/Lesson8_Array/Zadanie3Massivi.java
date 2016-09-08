package Module_1_Basic.Lesson8_Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Roman on 17.11.2015.
 */
public class Zadanie3Massivi {

    public static void main(String[] args) {

        // Создать массив элементы которого вводятся с клавиатуры(и размер также).
        // Скопировать его увеличив размер в 1,5 раза.
        // Отсортировать и вывести результат.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = sc.nextInt();

        int array[] = new int[a]; // Размер

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите элементы массива: ");

        for (int i = 0; i < a; i++) {
            array[i] = sc2.nextInt(); // Элементы
        }

        System.out.println(Arrays.toString(array));

        int [] array2 = Arrays.copyOf(array, (int) (array.length*(1.5)));
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));



    }
}
