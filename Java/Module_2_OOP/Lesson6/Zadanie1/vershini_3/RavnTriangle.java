package Module_2_OOP.Lesson6.Zadanie1.vershini_3;

/**
 * Created by Roman on 30.11.2015.
 */
public class RavnTriangle {
    //Равносторонний тр-ник

    private double a;
    private double h;

    private double p;
    private double s;

    public RavnTriangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double perimetr () {
        p = a + a + a;
        return p;
    }

    public double square() {
        s = (a * h) / 2;
        return s;
    }
}
