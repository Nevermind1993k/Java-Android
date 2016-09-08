package Module_2_OOP.Lesson4_Link.Zadanie_1;

/**
 * Created by Roman on 26.11.2015.
 */
public class Office {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Васька ПК", "Windos", 2010);
        System.out.println("Было: " + comp1.name + ", " + comp1.OS + ", " + comp1.year);
        comp1 = comp1.resetComputer(comp1, "Васька ПК", "Linux", 2010);
        System.out.println("Стало: " + comp1.name + ", " + comp1.OS + ", " + comp1.year + "\n");


        Computer comp2 = new Computer("Петька ПК", "MacOS", 2015);
        System.out.println("Было: " + comp2.name + ", " + comp2.OS + ", " + comp2.year);
        comp2 = comp2.resetComputer(comp2, "Петька ПК", "Linux", 2015);
        System.out.println("Стало: " + comp2.name + ", " + comp2.OS + ", " + comp2.year + "\n");


        Computer comp3 = new Computer("Гриша ПК", "Android", 2014);
        System.out.println("Было: " + comp3.name + ", " + comp3.OS + ", " + comp3.year);
        comp3=comp3.resetComputer(comp3, "Гриша ПК", "Linux", 2014 );
        System.out.println("Стало: " + comp3.name + ", " + comp3.OS + ", " + comp3.year);


    }
}
