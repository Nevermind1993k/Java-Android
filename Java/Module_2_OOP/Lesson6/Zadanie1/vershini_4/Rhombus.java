package Module_2_OOP.Lesson6.Zadanie1.vershini_4;

/**
 * Created by Roman on 30.11.2015.
 */
public class Rhombus {
    private double h;

    private double p;
    private double s;

    public Rhombus(double h) {
        this.h = h;
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
        p = h * 4;
        return p;
    }

    public double square () {
        s = h * h;
        return h;
    }
}
