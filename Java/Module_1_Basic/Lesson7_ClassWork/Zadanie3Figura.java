package Module_1_Basic.Lesson7_ClassWork;

/**
 * Created by Roman on 13.11.2015.
 */
public class Zadanie3Figura {

    public static void main(String[] args) {

        /*Вывести такую фигуру: a=1, b=4;


        *
        **
        ***
        ****
        ***
        **
        *


        */

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }


    }
}
