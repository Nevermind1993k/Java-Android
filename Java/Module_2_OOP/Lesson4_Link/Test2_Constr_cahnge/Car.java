package Module_2_OOP.Lesson4_Link.Test2_Constr_cahnge;


/**
 * Created by Roman on 26.11.2015.
 */
public class Car {
    public Car(String colorCar, int year) {
        this.colorCar = colorCar;
        this.year = year;
    }

    String colorCar;
    int year;

    //Метод работающий с обьектами
    Car resetCar (Car a, String colorCar, int year) {       // Метода 1
        a.colorCar = colorCar;
        a.year = year;
        return a;
    }

    public void resetCar2 (String colorCar, int year) {     // Метода 2
        this.colorCar = colorCar;
        this.year = year;
    }
}
