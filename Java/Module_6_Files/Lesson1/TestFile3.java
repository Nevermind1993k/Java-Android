package Module_6_Files.Lesson1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Roman on 17.12.2015.
 */
public class TestFile3 {
    public static void main(String[] args) {
        File ff = new File("a4.txt");
        try {
            if (!ff.exists()) {
                ff.createNewFile();
            }
            PrintWriter pw = new PrintWriter(ff.getAbsoluteFile());
            try {
                for (int i = 0; i < 10; i++) {
                    pw.println(i);
                }
            } finally {
                pw.close(); // "Как сохранение"
            }
        } catch (IOException e) {
            System.out.println("ERROR!");
        }
    }
}
