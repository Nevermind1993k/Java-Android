package Module_2_OOP.Lesson2_Recursion.Test4_Car;

/**
 * Created by Roman on 24.11.2015.
 */
public class Garage {
    public static void main(String[] args) {
        Car m1 = new Car();
        m1.color = "green";
        m1.weight = 1500;
        m1.year = 1982;
        m1.print(); //Распечатает без скорости
        m1.acceleration(30); // передали скорость в Car
        m1.print(); // распечатает с скоростью
    }
}
