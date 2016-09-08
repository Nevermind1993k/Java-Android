package Module_2_OOP.Lesson1_NewMethod;

/**
 * Created by Roman on 23.11.2015.
 */
public class TestOOP6 {
    //•В теле метода могут вызываться другие методы.
    //•Параметром метода может быть результат другого метода.

    public static void main(String[] args) {
        System.out.println(Volume(2.1, 3));//Volume ниже
    }

    static double Area (double r) {
        return Math.PI*r*r;
    }

    static double Volume (double r, double h) {
        return h*Area(r); // Area выше
    }
}
