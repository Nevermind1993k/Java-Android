package Module_2_OOP.Lesson1_NewMethod;

import java.util.Random;

/**
 * Created by Roman on 23.11.2015.
 */
public class TestOOP5 {
    public static void main(String[] args) {
        //Пример метода с вызовом по ссылке приводящий к изменению данных

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

    static int[] sort (int[]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) { // Если поставить j=0, будет обратная сортировка
                int temp;
                if (a[j] < a[i]) { // Сортировка выборкой
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
}
