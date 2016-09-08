package Module_2_OOP.Lesson4_Link.Test3;

/**
 * Created by Roman on 26.11.2015.
 */
public class Garage {
    public static void main(String[] args) {
        Car mazda = new Car ("Red" , 2015 , 2.3);
        Car reno = new Car ("Orange", 2006, 1.5);
        Car peugeot = new Car ("Black", 1999, 1.8);

        System.out.println(mazda.colorCar + " " + mazda.year);

        //mazda - mazda.resetCar (mazda, "Blue", 2009);
        mazda.resetCar(reno, "Blue", 2009);
        mazda=mazda.resetCar(peugeot,"White", 1990);
        mazda=reno.resetCar(peugeot,"White2",1995);

        System.out.println("mazda " + mazda.colorCar + " " + mazda.year + " " + mazda.value);
        System.out.println("reno " + reno.colorCar + " " + reno.year + " " + reno.value);
        System.out.println("peugeot " + peugeot.colorCar + " " + peugeot.year + " " + peugeot.value);

    }
}
