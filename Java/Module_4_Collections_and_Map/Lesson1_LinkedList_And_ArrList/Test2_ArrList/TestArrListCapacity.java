package Module_4_Collections_and_Map.Lesson1_LinkedList_And_ArrList.Test2_ArrList;

import java.util.ArrayList;

/**
 * Created by Roman on 08.12.2015.
 */
public class TestArrListCapacity {
    public static void main(String[] args) {

        // стандартная инициализация
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        // инициализация с екостью 50
        ArrayList<String> arrayList = new ArrayList<String>(50);
        arrayList.add("12345");

        // инициализация с элементами массива arrayList
        ArrayList<String> arrayList1 = new ArrayList<String>(arrayList);
        System.out.println(arrayList1.toString());

        // увеличение до нужного размера
        arrayList.ensureCapacity(2000);

        // уменьшение до реального размера
        arrayList.trimToSize();

    }
}
