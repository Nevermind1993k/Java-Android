package Module_4_Collections_and_Map.Lesson1_LinkedList_And_ArrList.ClassWork2;

import java.util.Arrays;

/**
 * Created by Roman on 09.12.2015.
 */
//Создатьсвой аналог ArrayList используя массив.
// Со своими методами Set(), Get(), Remove(), toString()и 2-я конструкторами.
public class AnalogArrayList {
    int[] arr;

    public AnalogArrayList(int n) {
        int[] arrRazmer = new int[n];
        arr = arrRazmer;
    }

    public void analogSet(int i, int e) {
        arr[i] = e;
    }

    public void analogGet(int i) {
        System.out.println(arr[i]);
    }

    public void analogRemove(int i) {
        int arrRemove[] = new int[arr.length - 1];
        for (int j = 0; j < i; j++) {                   // перекидываем в новый массив все элементы до "i"
            arrRemove[j] = arr[j];
        }
        for (int j = i; j < arrRemove.length; j++) {    // перекидываем в номый массив все элементы после "i"
            arrRemove[j] = arr[j + 1];
        }
        System.out.println(Arrays.toString(arrRemove));
    }

    public void analogToString() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
