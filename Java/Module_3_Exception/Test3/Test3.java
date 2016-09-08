package Module_3_Exception.Test3;

/**
 * Created by Roman on 07.12.2015.
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            a[0] = 22 / 2;
            a[1] = 33 / 3;
            a[2] = 33 / 0;
            a[3] = 33 / 2;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("!!!");
        }
        System.out.println("YES!");
    }
}

