package Module_2_OOP.Lesson2_Recursion;

/**
 * Created by Roman on 24.11.2015.
 */
public class Test2_Recursion2 {

    //Глубинная рекурсия

    static int count = 0;

    public static void main(String[] args) {
        int a = recursionMethod(2, 4);
        System.out.println("a - " + a);
    }

    public static int recursionMethod (int a, int b) { // Сюда падает 2 и 4
        int c = a + b;
        return recursionMethodTwo(1, 1);
    }

    public static int recursionMethodTwo(int a, int b) { // сюда падает 1 и 1
        System.out.println("Отработал recursionMethodTwo " + count++);
        return recursionMethod(4, 2);
    }
}
