package Module_2_OOP.Lesson2_Recursion.Zadanie1;

/**
 * Created by Roman on 24.11.2015.
 */
public class Robot {
    //Создать 2-3 произвольных объекта, которые выполняют какие либо действия.

    String work;
    String name;
    String material;
    double weight;
    String movement;

    void spaceengineering() {
        System.out.println("Something was fixed");
    }

    void printallifo() {
        System.out.println("Имя робота: " + name);
        System.out.println("Тип работы: " + work);
        System.out.println("Вид передвижения: " + movement);
        System.out.println("Материал: " + material);
        System.out.println("Вес: " + weight +" кг");
    }
}
