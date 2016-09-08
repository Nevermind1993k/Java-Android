package Module_2_OOP.Lesson5.Zadanie_1;

/**
 * Created by Roman on 29.11.2015.
 */
// Создать 3 объекта и посчитать их площадь (объем) используя перегрузку методов и конструктора.
public class Main {
    public static void main(String[] args) {
        Figura f1 = new Figura();

        f1.figure("Круг", 3);
        f1.figure("Прямоугольник" , 3, 4);
        f1.figure("Треугольник", 3, 4, 5);


    }
}
