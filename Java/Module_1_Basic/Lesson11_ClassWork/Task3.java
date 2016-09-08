package Module_1_Basic.Lesson11_ClassWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Roman on 20.11.2015.
 */
public class Task3 {

    public static void main(String[] args) {

        //Анкеты. Создать аналог базы данных (используя массив) в который хранится имя, рост,вес, порядковый номер.
        //При вводе номера выводятся данные о челевеке

        String [][] Anketa ={{"1","Василий","180 см","90 кг"},
                            {"2","Петр","185 см","85 кг"},
                            {"3","Арсений","160 см","80"}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер счастливчика: ");
        int number = sc.nextInt();                              // Порядковый номер который будем вводить

        if (number == 1) {
            System.out.println(Arrays.toString(Anketa[0]));
        }
        if (number == 2) {
            System.out.println(Arrays.toString(Anketa[1]));
        }
        if (number == 3) {
            System.out.println(Arrays.toString(Anketa[2]));
        }

    }
}
