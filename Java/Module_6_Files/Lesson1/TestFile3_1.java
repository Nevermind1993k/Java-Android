package Module_6_Files.Lesson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Roman on 18.12.2015.
 */
public class TestFile3_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File ff = new File("a3_1.txt");
        try (PrintWriter pw = new PrintWriter(ff.getAbsoluteFile())) {
            for (int i = 0; i < 10; i++)
                pw.println(i);
        }
    }
}
