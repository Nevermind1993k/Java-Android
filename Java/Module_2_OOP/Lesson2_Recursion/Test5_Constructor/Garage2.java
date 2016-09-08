package Module_2_OOP.Lesson2_Recursion.Test5_Constructor;

/**
 * Created by Roman on 24.11.2015.
 */
public class Garage2 {
    public static void main(String[] args) {
        Car2 m2 = new Car2("green" , 1500, 1982); //Вводим параметры коструктора
        m2.print(); // Без скорости
        m2.acceleration(30);//Записать скорость
        System.out.println();
        m2.print(); // С скоростью
    }
}
