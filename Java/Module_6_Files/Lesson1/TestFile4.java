package Module_6_Files.Lesson1;

import java.io.*;

/**
 * Created by Roman on 18.12.2015.
 */
public class TestFile4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("a4.txt"); // с какого файла будем передавать текст на консоль
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        String line;
        System.out.println("Print File " + f.getName() + "? y/n");
        name = br.readLine(); // построчное считывание
        if (name.equals("y"))
            while ((line = fin.readLine()) != null) System.out.println(line);
        fin.close();
    }
}
