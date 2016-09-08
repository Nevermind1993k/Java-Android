package Module_6_Files.Lesson2.CW2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Roman on 18.12.2015.
 */
// Создать массив из 4-х объектов.
// У каждого объекта должны быть поля: имя, возраст, телефон, e-mail.
// Перезаписать эти данные в файл.
public class CW2_main {
    public static void main(String[] args) throws FileNotFoundException {
        File ff = new File("M6_CW2_Humans.txt");


        Object[] arrayHumans = new Object[4];
        arrayHumans[0] = new Humans("Вася", 22, 3223232, "Vasia@gmail.com");
        arrayHumans[1] = new Humans("Петя", 33, 2282828, "Petia@yandex.ru");
        arrayHumans[2] = new Humans("Радик", 44, 1234567, "Radik@ukr.net");
        arrayHumans[3] = new Humans("Иван", 55, 6781239, "Ivan@i.ua");



        try (PrintWriter pw = new PrintWriter(ff.getAbsoluteFile())) {
            for (int i = 0; i < arrayHumans.length; i++) {
                pw.print(arrayHumans[i].toString() + "\n");
            }
        }



    }
}
