package Module_4_Collections_and_Map.Lesson1_LinkedList_And_ArrList.Test4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Roman on 08.12.2015.
 */
public class TestArrToArrList {
    public static void main(String[] args) {

        Integer integer2[] = {2, 3};

        ArrayList<Integer> integerArrayList2 = new ArrayList<>(Arrays.asList(integer2));
        System.out.println(integerArrayList2.toString());
    }
}
