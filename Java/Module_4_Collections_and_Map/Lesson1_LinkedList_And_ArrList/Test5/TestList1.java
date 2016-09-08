package Module_4_Collections_and_Map.Lesson1_LinkedList_And_ArrList.Test5;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by Roman on 09.12.2015.
 */
public class TestList1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(2);
        linkedList1.add(2, 3); // на позицию 2 ставим 3 (предидущую '2' мы двигаем вправо)
        System.out.println(linkedList1.toString());

        System.out.println(linkedList1.get(1));
        System.out.println(linkedList1.getFirst());
        System.out.println(linkedList1.getLast());
        linkedList1.set(0, 100); // изменение (замена) значения эл-та 0

        // вставить первым
        linkedList1.addFirst(0);
        linkedList1.offerFirst(10);
        System.out.println(linkedList1.toString());

        // вставить последним
        linkedList1.addLast(4);
        linkedList1.offerLast(5);
        System.out.println(linkedList1.toString());

        // удаление
        linkedList1.removeFirst(); // первый
        linkedList1.remove(3); // по индексу
        linkedList1.removeLast(); // последний
        System.out.println(linkedList1.toString());

        // инициализация с содержанием колекции linkedList1
        LinkedList<Integer> linkedList2 = new LinkedList<>(linkedList1); // приняло все значения линкедЛист1
        System.out.println("linkedList2: " + linkedList2);

        // 1 .add
        LinkedList<Integer> linkedListOne = new LinkedList<>();
        Collections.addAll(linkedListOne, 1, 2, 3, 4, 5);

        // 2 .add
        LinkedList<Integer> linkedListTwo = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        // 3 .add
        List<Integer> linkedListThree = asList(1, 2, 3, 4, 5);

        // удалить .toString()
        System.out.println(linkedListOne + linkedListTwo.toString() + linkedListThree.toString());


    }
}
