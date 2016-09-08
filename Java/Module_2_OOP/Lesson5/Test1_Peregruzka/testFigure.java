package Module_2_OOP.Lesson5.Test1_Peregruzka;

/**
 * Created by Roman on 29.11.2015.
 */
public class testFigure {
    String name;
    double a;
    int b;
    int c;
    int perimetr;
    double figure(double a) {
        return a*a;
    }
    void figure(String name, double a) {
        System.out.println(name + " : " + a * a);
    }
    void figure (String name, double a, int b, int c) {
        int perimetr2 = (int) (a + b + c);
        System.out.println("Периметр " + name + " : " + perimetr2);
    }
    void figure (String name , double a, int b, int c, int p) {
        this.perimetr = p;
        int p2 = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("S " + name + " : " + p2);
    }
}
