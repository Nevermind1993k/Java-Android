package Module_4_Collections_and_Map.Lesson3_Set.Test1_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Roman on 10.12.2015.
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(111);
        set.add(111);
        set.add(333);

        // Просмотр коллекции
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer i : set) {
            System.out.println("Вывод for: " + i);
        }

        set.remove(111); // удаляет по значению
        set.clear();

        set.add(123);
        set.add(333);
        System.out.println(set.contains(123)); // проверка наличия элемента

        Set<Integer> set2 = new HashSet<>();
        set2.add(123);

        set.removeAll(set2); // удаляет из set элементы set2
        for (Integer i : set) {
            System.out.println("Вывод for: " + i);
        }

    }
}
