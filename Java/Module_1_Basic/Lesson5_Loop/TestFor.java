package Module_1_Basic.Lesson5_Loop;

import java.util.Scanner;

/**
 * Created by Roman on 09.11.2015.
 */
public class TestFor {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(i);

        }
    }
}
