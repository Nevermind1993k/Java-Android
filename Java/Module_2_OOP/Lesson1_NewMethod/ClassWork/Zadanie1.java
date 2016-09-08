package Module_2_OOP.Lesson1_NewMethod.ClassWork;

/**
 * Created by Roman on 23.11.2015.
 */
public class Zadanie1 {

    public static void main(String[] args) {

        //Написать метод расчета объема аквариума.(с использованием return)

        int a = 22;
        int b = 33;
        int c = 44;

        int d = Volume(a, b, c); // обьем
        System.out.println("V= " +d);

    }

    static int Volume(int abc, int bcd, int cde ) {
        return abc * bcd * cde;
    }

}
