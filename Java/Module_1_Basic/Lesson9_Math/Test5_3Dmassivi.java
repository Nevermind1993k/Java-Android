package Module_1_Basic.Lesson9_Math;

import java.util.Arrays;

/**
 * Created by Roman on 18.11.2015.
 */
public class Test5_3Dmassivi {

    public static void main(String[] args) {

        /*
        //Инициализация
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(a));
        */

        int[][] b = new int[4][5];                      //4 строки, 5 значений
        for (int i = 0; i < b.length; i++) {            //b.length =4
            for (int j = 0; j < b[0].length; j++) {     //b[0].length =5
                b[i][j] = i + j;                        //Заполнение массива
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        int[][] c = new int[8][];
        for (int i = 0; i < c.length; i++) {            //c.length =8
            c[i] = new int[i];                          //на каждой итерации создаём новый массив
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = i + j;
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(c));     //тот же массив через deepToString
    }
}
