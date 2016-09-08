package Module_2_OOP.Lesson1_NewMethod.ClassWork;

/**
 * Created by Roman on 23.11.2015.
 */
public class Zadanie1v2 {

    public static void main(String[] args) {

        //Написать метод расчета объема аквариума.(с использованием void)
        int a = 22;
        int b = 33;
        int c = 44;

        Volume(a, b, c); // Обьем
    }

    static void Volume(int abd, int bcd, int cde) {
        int d = abd * bcd * cde;
        System.out.println("V= " + d);

    }
}
