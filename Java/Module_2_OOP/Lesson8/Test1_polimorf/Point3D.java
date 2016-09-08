package Module_2_OOP.Lesson8.Test1_polimorf;

/**
 * Created by Roman on 03.12.2015.
 */
public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void show() {
        System.out.println("shown as 3D!");
    }

    public String toString() {
        return "Point3D{" + "x=" + super.getX() + " y=" + super.getY() + " z=" + z + '}';
    }
}
