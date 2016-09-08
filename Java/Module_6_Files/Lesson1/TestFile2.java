package Module_6_Files.Lesson1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Roman on 17.12.2015.
 */
public class TestFile2 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        File ff = new File(".");
        try {
            if (!ff.exists()) {
                ff.createNewFile(); // Создаем пустой файл
            }
        } catch (IOException e) {
            pw.println("ERROR!");
        }
        File f1 = new File(ff.getAbsolutePath()); // Путь файла
        if (f1.isDirectory()) {
            String[] S = f1.list();
            for (int i = 0; i < S.length; i++) {
//                File F = new File(f1.getParent() + "/" + S[i]);
                File F;
                pw.println(S[i]);
                pw.println(new File(f1.getParent() + "/" + S[i]));
            }
        }
    }
}
