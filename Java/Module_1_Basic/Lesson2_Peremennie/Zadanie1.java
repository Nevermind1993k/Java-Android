package Module_1_Basic.Lesson2_Peremennie;

import java.util.Scanner;

/**
 * Created by Roman on 05.11.2015.
 */
public class Zadanie1 {

    public static void main(String[] args) {

        //**********************Классное задание на ввод с клавы*************************
        //Прочитать символы: I, l, o, v, e, j, a, v, a. И вывести фразу: I love java.

        Scanner scannerZadanie = new Scanner(System.in);

        String i = scannerZadanie.nextLine(),
                probel = scannerZadanie.nextLine(),
                l = scannerZadanie.nextLine(),
                o = scannerZadanie.nextLine(),
                v = scannerZadanie.nextLine(),
                e = scannerZadanie.nextLine(),
                probel1 = scannerZadanie.nextLine(),
                j = scannerZadanie.nextLine(),
                a = scannerZadanie.nextLine();

        System.out.println("Вы ввели: " + i + probel + l + o + v + e + probel1 + j + a + v + a);

    }
}
