package Module_2_OOP.Lesson6.Zadanie1.vershini_4;

/**
 * Created by Roman on 30.11.2015.
 */
public class Square {
    //квадрат

    private double a;

    private double p;
    private double s;

    public Square(int a) {
        this.a = a;
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

    public double perimetr () {
        p = a * 4;
        return p;
    }

    public double square () {
        s = a * a;
        return s;
    }

}
