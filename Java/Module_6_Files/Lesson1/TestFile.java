package Module_6_Files.Lesson1;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by Roman on 17.12.2015.
 */
public class TestFile {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        File f1 = new File("a3.txt");

        // Вывод полного пути к асоциированному файлу
        pw.println(f1.getAbsoluteFile());
    }
}
