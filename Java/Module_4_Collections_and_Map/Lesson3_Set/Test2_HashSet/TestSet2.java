package Module_4_Collections_and_Map.Lesson3_Set.Test2_HashSet;

import java.awt.*;
import java.util.HashSet;

/**
 * Created by Roman on 10.12.2015.
 */
public class TestSet2 {
    public static void main(String[] args) {
        // конструктор по умолчанию
        HashSet<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(1);

        // инициализация с передачей коллекции
        HashSet<Integer> integerSet2 = new HashSet<>(integerSet1);

        // с указанием емкости (по умолчанию 16)
        HashSet<Integer> integerSet3 = new HashSet<>(1000);

        // с указанием емкости и коеф. заполнения(по умолчанию 0,75)
        HashSet<Integer> integerSet4 = new HashSet<>(1000, (float) 0.5);//когда достигнет 500,увеличиться в 2 раза(2000)
    }
}
