package Module_2_OOP.Lesson4_Link.Test3;

/**
 * Created by Roman on 26.11.2015.
 */
public class Car {
    String colorCar;
    int year;
    double value;

    public Car(String colorCar, int year, double value) {
        this.colorCar = colorCar;
        this.year = year;
        this.value = value;
    }

    Car resetCar (Car a, String colorCar, int year) {
        a.colorCar = colorCar;
        a.year = year;
        return a;
    }
}
