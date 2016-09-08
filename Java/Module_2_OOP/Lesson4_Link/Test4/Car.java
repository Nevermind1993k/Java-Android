package Module_2_OOP.Lesson4_Link.Test4;

/**
 * Created by Roman on 26.11.2015.
 */
public class Car {
    int year;
    String color;

    Car(int t, String color) {
        year = t;
        this.color = color;
    }

    Car newCar() {
        Car prototype = new Car (year + 5, "Red");
        return prototype;
    }
}
