package Module_2_OOP.Lesson6.Zadanie1.vershini_3;

/**
 * Created by Roman on 30.11.2015.
 */
public class PriamTriangle {
    //Прямоугольный треугольник

    private double a, b, c;

    private double p;
    private double s;

    public PriamTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
        p = a + b + c;
        return p;
    }

    public double square () {
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

}
