package Module_1_Basic.Lesson5_Loop.HW_0911;

/**
 * Created by Roman on 11.11.2015.
 */
public class HW1TestCicle {

    public static void main(String[] args) {

        //Вывести на экран числа от 10 до 20 с помощью всех известных циклов.


        //if
        int a = 10;

        if (a == 10) {
            System.out.println("10");
        }


        //switch
        int b = 11;

        switch (b) {
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
        }


        //do-while
        int c = 12;

        do {
            System.out.println(c);
            c++;
        } while (c <= 15);


        //for
        int d = 20;

        for (int i = 16; i <= d; i++) {
            System.out.println(i);
        }


    }
}
