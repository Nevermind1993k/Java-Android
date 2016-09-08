package Module_2_OOP.Lesson1_NewMethod.ClassWork2;


public class CW2Array {
    public static void main(String[] args) {
        //Создать массив, на 10000 значений, числа от 0 до 1000,
        // нужно отобрать из них те которые делятся без остатка на 13.5.
        // вывести их на печать и посчитать сумму.

        int[] a = new int[1000];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        print(a);//Полный массив
        System.out.println();
        sort(a); // a % 13.5 == 0
        System.out.println();


    }

    static void print(int[] a) {
        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static int[] sort (int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 13.5 == 0) { // Делим на 13.5 без остатка
                System.out.print(a[i] + " ");
            }
        }
        return a;
    }


}
