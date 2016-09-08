package Module_2_OOP.Lesson8.Test1_polimorf;

/**
 * Created by Roman on 03.12.2015.
 */
public class Point2D extends Point1D {
    private double y;

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void show() {
        System.out.println("shown as 2D!");
    }

    public String toString() {
        return "Point2D{" + "x=" + super.getX() + " y=" + y + '}';
    }


}
