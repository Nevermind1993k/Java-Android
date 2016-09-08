package Module_6_Files.Lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Roman on 18.12.2015.
 */
//Записать в файл таблицу Пифагора.
public class CW1 {
    public static void main(String[] args) throws FileNotFoundException {
        File ff = new File("M6_CW1_Pifagor.txt");

        int sum = 0; // Результат
        int a = 10;
        int b = 10;

        try (PrintWriter pw = new PrintWriter(ff.getAbsoluteFile())) {
            for (int i = 1; i < a; i++) {
                for (int j = 1; j < b; j++) {
                    sum = i * j;
                    pw.print(sum + "\t");
                }
                pw.println();
            }
        }




    }
}
