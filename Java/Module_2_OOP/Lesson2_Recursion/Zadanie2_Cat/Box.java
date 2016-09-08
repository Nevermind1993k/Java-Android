package Module_2_OOP.Lesson2_Recursion.Zadanie2_Cat;

/**
 * Created by Roman on 24.11.2015.
 */
public class Box {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Кекс", "черно-белый", 2.5, 5);
        cat1.info();

        System.out.println();
        System.out.println("Щас кот1 будет чтото делать: ");
        cat1.voice();


        Cat cat2 = new Cat("Васька", "полосатый", 3.1, 7);
        cat2.info();

        System.out.println();
        System.out.println("Щас кот2, будет чтото делать: ");
        cat2.doshit();

    }
}
