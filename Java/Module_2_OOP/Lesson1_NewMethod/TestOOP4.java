package Module_2_OOP.Lesson1_NewMethod;

/**
 * Created by Roman on 23.11.2015.
 */
public class TestOOP4 {
    public static void main(String[] args) {
        //Все объектные типы передаются в методы по ссылке
        // —т.е. при передаче передается ссылка на объект,
        // и его изменения в теле метода оказывают влияние на сам объект.

        //***Пример метода с вызовом по ссылке***

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8}; // для ссылок исользуем массив
        System.out.println("Значение переменной в главном методе до вызова sum - ");
        for (int k : a) {
            System.out.print(k + " ");
        }
        System.out.println();
        sum(a);
        System.out.println();
        System.out.println("Значение переменной в главном методе после вызова sum - ");
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
    static void sum (int[]a) {
        a[3] = a[3] + 3; // Добавли к 4+3, и получили 7
        System.out.println("Значение а в методе sum - ");
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}
