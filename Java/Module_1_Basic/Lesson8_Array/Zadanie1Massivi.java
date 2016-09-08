package Module_1_Basic.Lesson8_Array;

/**
 * Created by Roman on 17.11.2015.
 */
public class Zadanie1Massivi {

    public static void main(String[] args) {

        //Создать массив чисел от 0 до 20, вывести все парные числа, потом не парные и весь массив (for each).

        int a[] = new int[21];              // Массив из 21 чисел [1] = 0, [2] = 1 ...... [20] = 19, [21] = 20;

        for (int i = 0; i < 21; i++) {      // Заполнение Массива
            a[i] = i;
        }


        for (int i = 0; i < 21; i++) {
            if (a[i] % 2 == 0) {            // Парные числа
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();


        for (int i = 0; i < 21; i++) {
            if (a[i] % 2 == 1) {            // Не парные числа
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();


        for (int i : a) {                   // Вывод всего массива
            System.out.print(i + " ");
        }


    }
}
