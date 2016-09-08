package Module_2_OOP.Lesson2_Recursion.Test5_Constructor;

/**
 * Created by Roman on 24.11.2015.
 */
public class Car2 {
    //Имя конструктора должно совпадать с именем класса
    //Определение конструктора должно быть первым, что описано в классе !
    Car2(String color, double weigth, int year) { // Конструктор
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    String color;
    double weight;
    int year;
    private double velosity = 0;


    void beep() {
        System.out.println("BEEP-BEEP ! ! !");
    }
    void acceleration (double a) {  // Ускорение
        velosity = velosity + a; // velosity = 0;
    }
    void deceleration (double b) {  // Торможение
        if (velosity-b>=0) velosity = velosity -b;
    }
    void print() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Year car: " + year);
        System.out.println("Velosity: " + velosity);
    }

}
