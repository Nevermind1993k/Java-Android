package Module_2_OOP.Lesson7_Nasledovanie;

/**
 * Created by Roman on 01.12.2015.
 */
public class Schoolboy extends People{
    private String school;
    private double averageScopeSchoole;// средняя оценка в школе

    public Schoolboy(String name, String lastName, int age, String school, double averageScopeSchoole) {
        super(name, lastName, age);
        this.school = school;
        this.averageScopeSchoole = averageScopeSchoole;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getAverageScopeSchoole() {
        return averageScopeSchoole;
    }

    public void setAverageScopeSchoole(double averageScopeSchoole) {
        this.averageScopeSchoole = averageScopeSchoole;
    }

    public void drinkCola() {
        System.out.println("I drink Cola !");
    }

    public void drinkMilk() {
        System.out.println("My name is " + super.getName());
        super.drinkMilk();
    }
}
