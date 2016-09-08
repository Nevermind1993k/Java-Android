package Module_2_OOP.Lesson1_NewMethod;

import java.util.Random;

/**
 * Created by Roman on 23.11.2015.
 */
public class TestOOP5v2 {
    public static void main(String[] args) {
        // Пример метода с вызовом по ссылке не приводящий к изменению данных

        Random rn = new Random();   //Создаем обьект рандом
        int[] a = new int[7];
        int[] b = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = rn.nextInt(20); //каждому і-му обьекту добавляем значения 0-20
        }
        print(a); //отдельный метод где происходит распечатка массива
        b = sort(a); // в метод сорт передаём массив, сортируем "а" ниже, потом присваеваем это b
        print(b);
        print(a);
    }

    static void print (int[]a) {
        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static int [] sort (int[]a) {
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        for (; ; ) {
            int sum = 0;
            for (int i = 0; i < b.length - 1; i++) {
                int temp;
                if (b[i] > b[i + 1]) {
                    temp = b[i];
                    b[i] = b[i + 1];
                    b[i + 1] = temp;
                    sum++;
                }
            }
            if (sum == 0) break;
        }
        return b;
    }
}
