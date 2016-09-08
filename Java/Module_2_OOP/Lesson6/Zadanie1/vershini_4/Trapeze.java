package Module_2_OOP.Lesson6.Zadanie1.vershini_4;

/**
 * Created by Roman on 30.11.2015.
 */
public class Trapeze {
    private double a, b, c, d;
    private double h;

    private double p;
    private double s;

    public Trapeze(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
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
        p = a + b + c + d;
        return p;
    }

    public double square () {
        s = ((a + b) * h) / 2;
        return s;
    }
}
