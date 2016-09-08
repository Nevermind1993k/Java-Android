package Module_2_OOP.Lesson4_Link.Zadanie_2;

/**
 * Created by Roman on 26.11.2015.
 */
public class Garage {
    public static void main(String[] args) {
        //Создать 2-е группы объектов: Заказчик и Исполнитель с несколькими полями,
        //поменять местами одно из полей.

        Car[] CarGarage = new Car[5];
        Bike[] BikeGarage = new Bike[5];


        for (int i = 0; i < CarGarage.length; i++) {        // Cars
            CarGarage[i] = new Car("Lada", 50, 2015);
        }

        for (int i = 0; i < BikeGarage.length; i++) {       // Bikes
            BikeGarage[i] = new Bike("Kawasaki", 350, 2015);
        }

        for (int i = 0; i < BikeGarage.length; i++) {       // Magic
            CarGarage[i].maxSpeed = BikeGarage[i].maxSpeed;
        }

        for (int i = 0; i < CarGarage.length; i++) {        // Out
            System.out.println(CarGarage[i].name + ", " + CarGarage[i].maxSpeed + "km, " + CarGarage[i].year);
        }


    }
}
