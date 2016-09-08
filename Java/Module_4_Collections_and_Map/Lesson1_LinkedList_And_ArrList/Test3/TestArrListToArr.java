package Module_4_Collections_and_Map.Lesson1_LinkedList_And_ArrList.Test3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Roman on 08.12.2015.
 */
public class TestArrListToArr {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);

        // Перевод в масссив
        Integer[] integerArr = new Integer[integerArrayList.size()];
        integerArrayList.toArray(integerArr);

        for (int i : integerArr) {
            System.out.print(i + " ");
        }

        System.out.println('\n' + Arrays.toString(integerArr));
        System.out.println(integerArr.toString()); // так делать нельзя
        System.out.println(integerArrayList.toString());
    }
}
