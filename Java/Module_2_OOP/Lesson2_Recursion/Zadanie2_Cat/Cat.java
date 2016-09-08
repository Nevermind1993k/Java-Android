package Module_2_OOP.Lesson2_Recursion.Zadanie2_Cat;

/**
 * Created by Roman on 24.11.2015.
 */
public class Cat {

    Cat(String name, String color, double weight, int old) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.old = old;

    }

    String name;
    String color;
    double weight; // в кг
    int old; // в годах

    void voice () {
        System.out.println(name + ": Meow");
    }

    void doshit () {
        System.out.println("  .");
        System.out.println(" ...");
        System.out.println("......");
        System.out.println("........");
        System.out.println("Ой");
    }

    void info () {
        System.out.println("Имя:\t\t" + name);
        System.out.println("Цвет:\t\t" + color);
        System.out.println("Вес:\t\t" + weight + " кг");
        System.out.println("Возраст:\t" + old + " лет");
    }
}
