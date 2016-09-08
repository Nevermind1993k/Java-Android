package Module_6_Files.Lesson2.CW3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman on 18.12.2015.
 */
// Считать из файлов почтовый адрес и записать его в новый файл, построчно.
public class CW3_main {
    public static void main(String[] args) throws IOException {
        // Считываем из файла
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("M6_CW2_Humans.txt"); // с какого файла будем передавать текст на консоль
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        String line;
        System.out.println("Print File " + f.getName() + "? y/n");
        name = br.readLine(); // построчное считывание
        if (name.equals("y"))
            while ((line = fin.readLine()) != null) System.out.println(line);
        fin.close();

        // Запись в новый файл, построчно
        String[] ImpData = null;
        try {
            String str = null;
            BufferedReader br1 = new BufferedReader(new FileReader("M6_CW2_Humans.txt"));
            while ((str = br1.readLine()) != null) {
                String[] list = str.split(" ");
                for (String it : list) {
                    System.out.printf("%s\t", it);
                }
                System.out.println();
            }
            br1.close();
        } catch (IOException exc) {
            System.out.println("IO error!" + exc);
        }

    }
}
