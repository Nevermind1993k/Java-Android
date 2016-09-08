package Module_1_Basic.Lesson8_Array;

import java.util.Arrays;

/**
 * Created by Roman on 17.11.2015.
 */
public class Test4MetodiMassivi {

    public static void main(String[] args) {

        //*****Копирование в ручную*****
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 2;
        }
        int[] arr2 = new int[10];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));


        //*******System.arraycopy********
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i * 2;
        }
        System.out.println("arr3: " + Arrays.toString(arr3));

        int[] arr4 = new int[14]; // 14 цифр
        System.arraycopy(arr3, 0, arr4, 2, arr3.length);
        // копирует arr3.length элементов массива arr3, с позиции 0.
        // В массив arr4 начиная с позиции 2
        System.out.println("arr4: " + Arrays.toString(arr4));

        //*****Arrays.copyOf(Копируемый массив, длинна нового массива)*****
        int[] arr5 = Arrays.copyOf(arr4, arr4.length * 2); //копирование массива с увеличением длины нового массива
        System.out.println("arr5: " + Arrays.toString(arr5));

        //******Arrays.copyOfRange(копируемый массив, с элемента, до элемента)*****
        int[] arr6 = Arrays.copyOfRange(arr4, 0, arr4.length * 2); // копирование массива с увеличением длинны нового массива
        System.out.println("arr6: " + Arrays.toString(arr6));

        //***** Заполнение массива****
        int[] arr7 = new int[7];
        Arrays.fill(arr7, 3 + 34); // заполнит все 7 значений цифрами 37
        System.out.println("arr7: " + Arrays.toString(arr7));

        //***** Быстрая сортировка*****
        int arr8[] = {5, 1, 9, 6, 9, 2, 4};
        Arrays.sort(arr8, 1, 5); // Указываем с какого по какое значение сортировать
        System.out.println("Сортировка arr8 от 1го значения до 5го: " + Arrays.toString(arr8));
        Arrays.sort(arr8);// Отсортирует всё, от меньшего к большему
        System.out.println("Сортировка arr8: " + Arrays.toString(arr8));

        //******Сравнение массивов*****
        System.out.println(arr1.equals(arr2)); // не работает для массивов
        boolean barr = Arrays.equals(arr1, arr2); // а это работает!
        System.out.println(barr);


    }
}
