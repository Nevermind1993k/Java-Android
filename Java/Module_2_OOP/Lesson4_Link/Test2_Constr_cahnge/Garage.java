package Module_2_OOP.Lesson4_Link.Test2_Constr_cahnge;

/**
 * Created by Roman on 26.11.2015.
 */
public class Garage {
    public static void main(String[] args) {
        Car mazda = new Car("Red", 2015);

        System.out.println(mazda.colorCar + " " + mazda.year);

        mazda = mazda.resetCar(mazda, "Blue", 2009); //Меняем цвет и год (Обьект, элемент)               // Метода 1
        System.out.println(mazda.colorCar + " " + mazda.year);

        mazda.resetCar2("Black", 2010);                                                                  // Метода 2
        System.out.println(mazda.colorCar + " " + mazda.year);
    }
}
