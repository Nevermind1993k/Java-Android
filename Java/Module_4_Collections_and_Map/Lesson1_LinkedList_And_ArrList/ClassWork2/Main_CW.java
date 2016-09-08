package Module_4_Collections_and_Map.Lesson1_LinkedList_And_ArrList.ClassWork2;

/**
 * Created by Roman on 09.12.2015.
 */
public class Main_CW {
    public static void main(String[] args) {
        AnalogArrayList analogArrayList = new AnalogArrayList(5);
        analogArrayList.analogSet(0, 11);
        analogArrayList.analogSet(1, 22);
        analogArrayList.analogSet(2, 33);
        analogArrayList.analogSet(3, 44);
        analogArrayList.analogSet(4, 55);

        analogArrayList.analogToString();

        analogArrayList.analogGet(3);
        analogArrayList.analogRemove(1);
    }
}
