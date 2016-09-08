package Module_1_Basic.Lesson5_Loop.HW_0911;

/**
 * Created by Roman on 11.11.2015.
 */
public class HW2podelit100na3 {

    public static void main(String[] args) {

        //Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.

        int a = 100;

        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }
}
