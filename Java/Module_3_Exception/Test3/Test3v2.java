package Module_3_Exception.Test3;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by Roman on 07.12.2015.
 */
public class Test3v2 {
    public static void main(String[] args) {
        File ff = new File("a2.txt");
        try {
            int[] a = new int[2];
            a[0] = 22 / 2;
            a[1] = 33 / 3;
            a[2] = 33 / 0;
            a[3] = 22;

            if (!ff.exists()) {
                ff.createNewFile();
            }
            PrintWriter pw = new PrintWriter(ff.getAbsoluteFile());
            try {
                for (int i = 0; i < 10; i++)
                    pw.println(i);
            } finally {
                pw.close();
            }
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива!");
        } catch (Exception ex) {
            System.out.println("Ошибка не предусмотренная выше");
            ex.printStackTrace();
        } catch (OutOfMemoryError ex) {
            System.out.println("OutOfMemoryError");
        }
    }
}
