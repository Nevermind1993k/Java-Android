package Module_4_Collections_and_Map.Lesson1_LinkedList_And_ArrList.ClassWork;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Roman on 08.12.2015.
 */
// Написать метод для конвертации массива строк/чисел в список.
public class CW1 {
    public static void main(String[] args) {

        String array[] = {"Новый", "текст", "тут"};
        System.out.println(Arrays.deepToString(array));

        CW1 s = new CW1();
        s.conversion(array);
    }


    public ArrayList<String> conversion(String array123[]) {
        ArrayList<String> StringArrayList = new ArrayList<>();

        for (String s : array123) {
            StringArrayList.add(s);
        }

        StringArrayList.add("228");
        System.out.println(StringArrayList.toString());
        return StringArrayList;
    }
}
