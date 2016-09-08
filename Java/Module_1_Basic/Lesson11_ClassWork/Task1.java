package Module_1_Basic.Lesson11_ClassWork;

import java.util.Arrays;

/**
 * Created by Roman on 20.11.2015.
 */
public class Task1 {

    public static void main(String[] args) {

        //Создать массив символов (обязательно должна присутствовать буква "о"), проверить его на наличие символов:
        //"а","р","д" Вывести результат проверки, отсортировать, вывести результат, отзеркалить, заменить символ "о"
        // на "у"

        Character[] chr = {'о', 'а', 'з', 'и', 'с', 'р' };


        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == 'а' || chr[i] == 'р' || chr[i] == 'д') {  //Проверка
                System.out.println("Мы нашли: " + chr[i]);
            }
        }
        Arrays.sort(chr);
        System.out.println(Arrays.toString(chr));


        /*Character[] chr2 = new Character[chr.length];             // Варинт отзеркаливания 1
        for (int i = 0; i < chr.length; i++) {
            chr2[chr2.length - i - 1] = chr[i];
        }
        System.out.println(Arrays.toString(chr2));*/

        char ch;                                                    // Вариант отзеркаливания 2
        for (int i = 0; i < chr.length / 2; i++) {
            ch = chr[i];
            chr[i] = chr[chr.length - 1 - i];
            chr[chr.length - 1 - i] = ch;
            if (chr[i] =='о'){                                      // Замена 'о' на 'у'
                chr[i] ='у';
            }
        }
        System.out.println(Arrays.toString(chr));




    }
}
