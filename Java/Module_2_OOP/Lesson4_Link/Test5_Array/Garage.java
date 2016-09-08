package Module_2_OOP.Lesson4_Link.Test5_Array;

/**
 * Created by Roman on 26.11.2015.
 */
public class Garage {
    public static void main(String[] args) {

        Car[] myGarage = new Car[3];
        for (int i = 0; i < myGarage.length; i++) {
            myGarage[i] = new Car("BMV", 2000 + i);
            System.out.println(myGarage[i].year);
        }

        myGarage[2].name = "subaru";
        System.out.println(myGarage[2].name + " " + myGarage[2].year);
    }
}
