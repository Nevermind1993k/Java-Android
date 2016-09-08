package Module_2_OOP.Lesson5.Zadanie_1;

/**
 * Created by Roman on 29.11.2015.
 */
public class Figura {

    void figure (String name, double a, double b) { // Прямоугольник
        System.out.println("S " + name + " : " + a * b);
    }

    void figure (String name, double r) { // Круг
        System.out.println("S " + name + " : " + Math.PI * (r * r));
    }

    void figure (String name, int a, int b, int c) {
        int p = a + b + c;
        int s = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("S " + name + " : " + s);
    }

}
