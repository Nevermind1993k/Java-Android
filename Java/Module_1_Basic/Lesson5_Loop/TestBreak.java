package Module_1_Basic.Lesson5_Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Roman on 12.11.2015.
 */
public class TestBreak {

    public static void main(String[] args) throws IOException {

        /*

        int n=10;
        for (int i = 0; i < n; i++) {
            if (i==3) continue; //Пропустит 3 (1,2,4,5....)
            if (i==7) break; //завершит цикл когдай дойдёт до 7
            System.out.println(i);
        }
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        int num = Integer.parseInt(number);
        String number2 = br.readLine();
        int num2 = Integer.parseInt(number2);

        stopFor:
        {
            while (num < 10) {
                System.out.println("num внутри while: " + num);
                for (num = num; num < 9; num++) {
                    System.out.println("num внутри for: " + num + '\n'
                            + "num2 внутри for: " + num2);
                    num++;
                    if (num2 >= 5) {
                        break stopFor;
                    }
                    num2++;

                }
            }
            System.out.println("После циклов num = " + num + "и num2 = " + num2);
        }


    }
}
