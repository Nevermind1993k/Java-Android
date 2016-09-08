package Module_2_OOP.Lesson1_NewMethod;

/**
 * Created by Roman on 23.11.2015.
 */
public class TestOOP3 {
    public static void main(String[] args) {
        //Все примитивные типы передаются по значению
        // —т.е. при передаче создается локальная копия переменной
        // и в методе используется копия.
        // Т.е. при изменении значения переменной в методе в главном методе ее значение не меняется.

        //***Пример метода с вызовом по значению***

        int a = 5;
        int b = 3;
        System.out.println("Значение переменной в главном методе до вызова sum - " + a);
        System.out.println("Результат вызова метода sum - " + sum(a, b));
        System.out.println("Значение переменной в главном методе после вызова sum - " + a);
    }
    static int sum (int a, int b) {
        a = a + 3;
        System.out.println("Значение а в методе sum - " + a);
        return a + b;
    }
}
