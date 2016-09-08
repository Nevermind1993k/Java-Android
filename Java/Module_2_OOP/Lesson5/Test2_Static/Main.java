package Module_2_OOP.Lesson5.Test2_Static;

/**
 * Created by Roman on 29.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Static.getA();

        System.out.println(Static.a);

        Static.a = 8;
        System.out.println(Static.a);

        Static.getA();
        Static.getA();
        Static.getA();

        System.out.println(Static.a);
    }
}
