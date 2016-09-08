package Module_4_Collections_and_Map.Lesson2_Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/**
 * Created by Roman on 09.12.2015.
 */
public class TestIterator {
    public static void main(String[] args) {
        List<Integer> listAr = new LinkedList<>();
        listAr.add(55);
        listAr.add(66);
        listAr.add(77);

        Iterator<Integer> iterator = listAr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // .set - модификациия
        ListIterator<Integer> iteratorList = listAr.listIterator();
        while (iteratorList.hasNext()) {
            Integer intNum = iteratorList.next();
            iteratorList.set(intNum + 2);
        }

        // просмотр списка
        // 1
        iteratorList = listAr.listIterator(1); // с 1-го эл-та
        while (iteratorList.hasNext()) {
            Integer i1 = iteratorList.next();
            System.out.print(i1 + " ");
            // 2
            //System.out.print(iteratorList.next() + " ");
        }
        // 3
        System.out.println('\n' + "listAr: " +listAr);

        // обратный порядок (с конца в начало)
        iteratorList = listAr.listIterator(listAr.size());
        while (iteratorList.hasPrevious()) {
            System.out.println(iteratorList.previous()+ " ");
        }
    }
}
