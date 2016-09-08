package Module_3_Exception.Test2_File;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Roman on 07.12.2015.
 */
public class Test2 {
    public static void main(String[] args) {
        File ff = new File("a.txt");
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
                pw.close();
                System.out.println("finally отработал");
            }
        } catch (IOException e) {
            System.out.println("ERROR !");
        } finally {
            System.out.println("finally2 отработал");
        }
    }
}
