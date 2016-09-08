package Module_2_OOP.Lesson6.Zadanie1.vershini_4;

/**
 * Created by Roman on 30.11.2015.
 */
public class Rectangle {
    //прямоугольник

    private double a, b;

    private double p;
    private double s;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double perimetr () {
        p = (a + b) * 2;
        return p;
    }

    public double square () {
        s = a * b;
        return s;
    }
}
