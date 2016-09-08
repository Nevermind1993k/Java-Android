package Module_2_OOP.Lesson1_NewMethod;

/**
 * Created by Roman on 23.11.2015.
 */
public class TestOOP {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        int c = sum(a, b);// Обьявляем ниже

        System.out.println(c);

    }

    static int sum(int a, int b) {

        return a + b;// Возвращает значение в sum,который c
    }
}
