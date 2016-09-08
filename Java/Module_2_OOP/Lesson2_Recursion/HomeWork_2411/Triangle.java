package Module_2_OOP.Lesson2_Recursion.HomeWork_2411;

/**
 * Created by Roman on 25.11.2015.
 */
public class Triangle {
    //Описать класс «triangle». В качестве свойств возьмите длинны сторон треугольника.
    // Реализуйте метод который будет возвращать площадь этого треугольника.
    // Создайте несколько объектов этого класса и протестируйте их.

   Triangle (String name, double a, double b) {
       this.name = name;
       this.a = a;
       this.b = b;
   }

    String name;
    double a;
    double b;


    void square () {
        System.out.println("Square: " + name + " = " + (a * b) / 2);

    }

}
