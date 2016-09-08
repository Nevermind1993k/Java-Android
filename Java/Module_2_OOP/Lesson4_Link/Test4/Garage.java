package Module_2_OOP.Lesson4_Link.Test4;

/**
 * Created by Roman on 26.11.2015.
 */
public class Garage {
    public static void main(String[] args) {
        Car reno = new Car (1999, "Blue");
        Car lada;

        lada = reno.newCar();

        System.out.println("reno.color: " + reno.color + " " + reno.year);
        System.out.println("lada.color: " + lada.color + " " + lada.year);
    }
}
