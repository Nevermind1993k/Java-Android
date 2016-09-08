package Module_1_Basic.Lesson9_Math.HW_1811;

import java.util.Arrays;

/**
 * Created by Roman on 19.11.2015.
 */
public class HW2_OtzerkalitMassiv {

    public static void main(String[] args) {

        /*Создать массив произвольных чисел,
        сделать так что б первые числа поменялись местами с последними (отзеркалить);*/

        int a[] = {1, 3, 5, 7, 9};
        int b[] = new int[a.length];

        for (int i = a.length-1; i >= 0; i--) {
            b[i]+=a[i];
        }
        System.out.println(Arrays.toString(b));




    }
}
