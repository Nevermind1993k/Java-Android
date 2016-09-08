package Module_1_Basic.Lesson9_Math.HW_1811;

/**
 * Created by Roman on 19.11.2015.
 */
public class HW1_SumaMassivov {

    public static void main(String[] args) {

        /*Создать 3 массива чисел (они могут быть разной длинны)
        и с помощью минимального количества циклов посчитать суму всех массивов;*/

        int a[] = {1, 2, 3};
        int b[] = {6, 3, 7, 2};
        int c[] = {8, 4, 3, 5, 1};

        int suma = 0;
        int sumb = 0;
        int sumc = 0;

        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        System.out.println(suma);

        for (int i = 0; i < b.length; i++) {
            sumb += b[i];
        }
        System.out.println(sumb);

        for (int i = 0; i < c.length; i++) {
            sumc += c[i];
        }
        System.out.println(sumc);


        System.out.println(suma + sumb + sumc);


    }
}
