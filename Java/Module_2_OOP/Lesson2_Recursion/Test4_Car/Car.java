package Module_2_OOP.Lesson2_Recursion.Test4_Car;

/**
 * Created by Roman on 24.11.2015.
 */
public class Car {
    String color;
    double weight;
    int year;
    private double velosity = 0; //Скорость

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
