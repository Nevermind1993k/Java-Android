package Module_2_OOP.Lesson4_Link.Zadanie_1;

/**
 * Created by Roman on 26.11.2015.
 */
// Создать несколько (3-4) объекта –ПК. Поменять 2-м ОС из Windows наLinux.

public class Computer {

    String name;
    String OS;
    int year;

    public Computer (String name, String OS, int year) {
        this.name = name;
        this.OS = OS;
        this.year = year;
    }

    Computer resetComputer (Computer a, String name, String OS, int year) {
        a.name = name;
        a.OS = OS;
        a.year = year;
        return a;
    }
}
