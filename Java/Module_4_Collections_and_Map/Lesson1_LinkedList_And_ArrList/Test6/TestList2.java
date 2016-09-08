package Module_4_Collections_and_Map.Lesson1_LinkedList_And_ArrList.Test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Roman on 09.12.2015.
 */
public class TestList2 {
    public static void main(String[] args) {
//        List <Integer> arrList = Collections.unmodifiableList(new ArrayList<Integer>());
        List<Integer> arrList = new ArrayList<>();
//        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(333);
        arrList.add(55);
        arrList.add(56);
        arrList.add(335);
        arrList.add(334);

        // .subList()
        System.out.println(arrList.subList(0, 3));

        arrList.subList(1, 3).clear();
        for (Integer i : arrList) {
            System.out.println("clear: " + i);
        }
        System.out.println();

        // unmodifiable
        arrList = Collections.unmodifiableList(arrList);
        //arrList.add(2); //error (нельзя добавлять т.к. unmod)

        for (Integer i : arrList) {
            System.out.println("unmod: " + i);
        }
    }
}
