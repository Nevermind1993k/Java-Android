package Module_4_Collections_and_Map.Lesson1_LinkedList_And_ArrList.Test1_List;

import java.util.ArrayList;

/**
 * Created by Roman on 08.12.2015.
 */
public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<Integer>(); // второй Integer можно не указовать
        arList.add(333);        // Добавить элемент (добавляет в конец)
        arList.add(55);
        arList.add(55);

        System.out.println(arList.get(0));
        arList.remove(0);       // удаление элемента 0
        System.out.println(arList.get(0));
        System.out.println("size = " + arList.size());
        arList.add(5);
        arList.add(83);

        for (int n : arList) {  // вывод всех эл-тов
            System.out.print(n + " ");
        }
        System.out.println();

        // Возвращает номер элемента
        System.out.println(arList.indexOf(5) + " - arList.indexOf(5)");
        // Проверка на наличие значений
        System.out.println(arList.isEmpty());

        arList.set(0, 44); // Устанавливаем значение на позицию 0
        for (int n : arList) {
            System.out.print(n + " ");
        }
        System.out.println();

        arList.add(0, 1); // Добавляем значение на позицию 0
        for (int n : arList) {
            System.out.print(n + " ");
        }
        System.out.println();

        arList.add(1); // Добавляем значение
        for (int n : arList) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
