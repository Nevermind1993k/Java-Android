package Module_2_OOP.Lesson5.Test1_Peregruzka;

/**
 * Created by Roman on 29.11.2015.
 */
public class Peregruzka {
    public static void main(String[] args) {
        testFigure t1 = new testFigure();
        System.out.println(t1.figure(3.5));
        t1.figure("Куб", 3.0);
        t1.figure("Треугольник 1", 2, 3, 4);
        t1.figure("Треугольник 2", 4, 5, 2, 6);

        TestFigure2 t2 = new TestFigure2("Куб2", 5.5);
        System.out.println(t2.figure2());


    }
}
