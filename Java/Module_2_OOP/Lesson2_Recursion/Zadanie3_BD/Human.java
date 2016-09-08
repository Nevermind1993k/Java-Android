package Module_2_OOP.Lesson2_Recursion.Zadanie3_BD;

/**
 * Created by Roman on 24.11.2015.
 */
public class Human {
    Human(int index, String name, double weight, double height) {
        this.index = index;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    String name;
    int index;
    double weight;
    double height;

    void info() {
        System.out.println("Номер: " +index);
        System.out.println("Имя: " +name);
        System.out.println("Вес: " +weight);
        System.out.println("Рост: " +height +"\n");
    }
}
