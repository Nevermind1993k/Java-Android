package Module_1_Basic.Lesson5_Loop;

import java.util.Scanner;

/**
 * Created by Roman on 09.11.2015.
 */
public class TestDoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
        while (n>0) {

            System.out.println(n);
            n=n-1;
            */
        do {
            System.out.println(n);
            n = n - 1;
        } while (n > 0);

    }
}
