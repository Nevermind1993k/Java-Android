package Module_2_OOP.Lesson4_Link.Test1_Link;

/**
 * Created by Roman on 26.11.2015.
 */
class Roll {
    int a, b;
}

public class Sushi {
    public static void main(String[] args) {
        Roll r1 = new Roll();
        r1.a = 2;
        r1.b = 3;

        Roll r2 = r1;
        System.out.println(r2.a + " " + r2.b);

        r2.b = 5;
        System.out.println(r1.b);

        r1 = null;

        System.out.println(r1.b + " " + r2.b);
    }
}
