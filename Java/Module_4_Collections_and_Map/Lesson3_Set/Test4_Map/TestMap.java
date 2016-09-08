package Module_4_Collections_and_Map.Lesson3_Set.Test4_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roman on 10.12.2015.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 11);
        map.put("key2", 12);
        map.put("key3", 13);

        // Получаем значение
        System.out.println(map.get("key1"));

        map.remove("key2"); // удаление
        System.out.println("key2: " + map.get("key2"));
        System.out.println("key4: " + map.get("key4"));

        // Размер
        System.out.println("Размер: " + map.size());

        // Получаем все ключи
        System.out.println();
        for (String k : map.keySet()) {
            System.out.println("map.keySet(); = " + k);
        }

        // Получаем все значения
        System.out.println();
        // 1)
        for (Integer v : map.values()) {
            System.out.print(v+ ", ");
        }
        // 2)
        System.out.println("\n");
        for (String k2 : map.keySet()) {
            System.out.println("k2: " + map.get(k2));
        }

        // Получаем все пары ключ/значение
        System.out.println();
        // 1)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Key = value: " +e);
        }
        // 2)
        System.out.println();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Проверка наличия ключа и значения
        System.out.println();
        System.out.println(map.containsKey("key3"));
        System.out.println(map.containsValue(15));
    }
}
