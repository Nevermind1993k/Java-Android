package Module_2_OOP.Lesson1_NewMethod.ClassWork;

/**
 * Created by Roman on 23.11.2015.
 */
public class Zadanie2v2 {
    public static void main(String[] args) {
        int grn = 10;
        int dol = 25;

        sum (grn,dol);
    }

    static void sum (int a, int b) {
        int result = a*b;
        System.out.println("10 грн в долларах: " + result);
    }
}
