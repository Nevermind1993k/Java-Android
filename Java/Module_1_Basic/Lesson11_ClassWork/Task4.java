package Module_1_Basic.Lesson11_ClassWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Roman on 20.11.2015.
 */
public class Task4 {

    public static void main(String[] args) {

        //Анкеты. Создать аналог базы данных (используя массив) в который хранится имя, рост,вес, порядковый номер.
        //При вводе номера выводятся данные о челевеке
        //* программа должна работать до тех пор пока пользователь не введет "exit", также должна быть ф-ия
        //добавления, удаления, вывода всех анкет

        String [][] Anketa ={{"1","Василий","180 см","90 кг"},
                            {"2","Петр","185 см","85 кг"},
                            {"3","Арсений","160 см","80 кг"}};


        System.out.println("Введите номер для данных о человеке");
        System.out.println("Введите exit для выхода из проги");
        System.out.println("Введите add для добавления ");
        System.out.println("Введите del для удаления ");
        System.out.println("Введите out для вывода всей инфы ");

            while (true) {
                Scanner sc = new Scanner(System.in);
                String number = sc.nextLine();                        // Порядковый номер который будем вводить
                if (number.equals("1")) {
                    System.out.println(Arrays.toString(Anketa[0]));
                }
                if (number.equals("2")) {
                    System.out.println(Arrays.toString(Anketa[1]));
                }
                if (number.equals("3")) {
                    System.out.println(Arrays.toString(Anketa[2]));
                }

                // Выход
                if (number.equals("exit")) {
                    break;
                }

                // Удаление номера
                if (number.equals("del")) {
                    System.out.println("Введите номер для удаления: ");
                    Scanner sc2 = new Scanner(System.in);             // Номер который будем удалять
                    String delnumber = sc2.nextLine();
                    if (delnumber.equals("1")) {
                        Arrays.fill(Anketa[0], "0");
                        System.out.println("Вы удалили 1ю ячейку ");
                    }
                    if (delnumber.equals("2")) {
                        Arrays.fill(Anketa[1], "0");
                        System.out.println("Вы удалили 2ю ячейку ");
                    }
                    if (delnumber.equals("3")) {
                        Arrays.fill(Anketa[2], "0");
                        System.out.println("Вы удалили 3ю ячейку ");
                    }
                }

                // Добавление
                if (number.equals("add")) {
                    System.out.println("Введите : номер, имя, рост, вес");
                    Scanner sc3 = new Scanner(System.in);
                    String newString = sc3.nextLine();// Строка в которой хранится инфа о новом челе
                    String [] arrNewstr = newString.split(", ", 4);// Разбиваем строку на 4 части после каждого ", "
                    System.out.println(Arrays.toString(arrNewstr));

                }

                // Вывод всех анкет
                if (number.equals("out")){
                    System.out.println(Arrays.deepToString(Anketa));
                }
            }
    }
}