package Module_1_Basic.Lesson8_Array;

import java.util.Arrays;

/**
 * Created by Roman on 17.11.2015.
 */
public class Test2ZapolnenieMassiva {

    public static void main(String[] args) {

        int a[] = new int [10]; //Массив из 10 целых чисел.
        for (int i = 0; i < 10; i++) {
            a[i]=i;
        }

        System.out.println("Элементы массива:" +a); //Неправельная запись, выводим адресс
        System.out.println("Элементы массива: " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            a[i]=i+10; //Увеличили значение массива на +10
        }

        System.out.println("Длина массива: " +a.length);
        System.out.println("Элементы массива: " +Arrays.toString(a));


    }
}
