package Module_2_OOP.Lesson1_NewMethod;

/**
 * Created by Roman on 23.11.2015.
 */
public class TestOOP2 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        sum(a, b); //Перебрасывает ниже

        System.out.println("Main!");// Потом выполняет это
    }

    static void sum (int a, int b) { // void не возвращает в main

        int c = a + b;

        System.out.println(c);
    }
}
