package Module_2_OOP.Lesson7_Nasledovanie;

/**
 * Created by Roman on 01.12.2015.
 */
public class Main_Nasledovanie {
    public static void main(String[] args) {
        People people = new People("Pawel", "Novikov", 1);
        Schoolboy schoolboy = new Schoolboy("Ann", "Gorohova", 13, "#99", 4.5);
        Student student = new Student("Roman", "Gorohov", 18, "#99", 4.3, "KPI", 4.8);

        student.setAge(19);

        people.drinkMilk();
        schoolboy.drinkCola();
        student.drinkMilk();
        student.drinkCola();
        student.drinkBeer();

        schoolboy.drinkMilk();
        student.drinkMilk();
    }
}
