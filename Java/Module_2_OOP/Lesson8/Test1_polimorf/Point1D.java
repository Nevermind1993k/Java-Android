package Module_2_OOP.Lesson8.Test1_polimorf;

/**
 * Created by Roman on 03.12.2015.
 */
public class Point1D extends Point {

    private double x;

    public Point1D(double x) {
        this.x = x;
    }

    public double getX() { return x;}

    public void setColor(int color) {this.color=color;}

    public int getColor() { return color;}

    public void show() {
        System.out.println("shown as 1D!");
    }

    //@Override
    public String toString() {
        return "Point1D{" + "x=" + x + '}';
    }
}
