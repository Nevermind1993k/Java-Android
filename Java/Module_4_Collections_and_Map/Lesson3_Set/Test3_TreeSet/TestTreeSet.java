package Module_4_Collections_and_Map.Lesson3_Set.Test3_TreeSet;

import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by Roman on 10.12.2015.
 */
public class TestTreeSet {
    public static void main(String[] args) {
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.add(50);
        intLinkedList.add(2);
        intLinkedList.add(77);
        intLinkedList.add(25);
        System.out.println(intLinkedList);

        TreeSet<Integer> intTreeSet2 = new TreeSet<>(intLinkedList);
        System.out.println(intTreeSet2);

        System.out.println(".subSet(2, 50): " + intTreeSet2.subSet(2, 50));
        System.out.println(".subSet(1, 51): " + intTreeSet2.subSet(1, 51));

        TreeSet<Integer> intTreeSet3 = new TreeSet<>(intLinkedList); // добавление новых элем.
        intTreeSet3.add(100);
        intTreeSet3.add(1);
        intTreeSet3.add(10);
        intTreeSet3.add(222);
        intTreeSet3.add(333);
        intTreeSet3.add(3);
        System.out.println(intTreeSet3);
    }
}
