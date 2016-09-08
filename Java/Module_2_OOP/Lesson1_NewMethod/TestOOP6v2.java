package Module_2_OOP.Lesson1_NewMethod;

/**
 * Created by Roman on 23.11.2015.
 */
public class TestOOP6v2 {

    public static void main(String[] args) {
        System.out.println(Volume(Area(2.1),3)); // Area ниже, Volume ниже
    }

    static double Area (double r) { //2.1
        return Math.PI * r * r;
    }

    static double Volume (double S, double h) {
        return h * S;
    }
}
