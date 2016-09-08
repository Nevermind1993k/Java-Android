package Module_2_OOP.Lesson2_Recursion.Zadanie3_BD;

/**
 * Created by Roman on 24.11.2015.
 */
public class BD {
    public static void main(String[] args) {

        Human h1 = new Human(1,"Лось", 85.1, 2.1);
        Human h2 = new Human(2, "Грыжа" , 33.1, 2);
        Human h3 = new Human(3, "Бритва" , 66, 1.5);

        h1.info();
        h2.info();
        h3.info();
    }
}
