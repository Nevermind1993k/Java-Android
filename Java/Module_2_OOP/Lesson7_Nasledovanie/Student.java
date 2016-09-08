package Module_2_OOP.Lesson7_Nasledovanie;

/**
 * Created by Roman on 01.12.2015.
 */
public class Student extends Schoolboy {
    private String institute;
    private double averageScopeInstitute; // Средняя оценка в универе

    public Student(String name, String lastName, int age, String school, double averageScopeSchoole, String institute, double averageScopeInstitute) {
        super(name, lastName, age, school, averageScopeSchoole);
        this.institute = institute;
        this.averageScopeInstitute = averageScopeInstitute;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public double getAverageScopeInstitute() {
        return averageScopeInstitute;
    }

    public void setAverageScopeInstitute(double averageScopeInstitute) {
        this.averageScopeInstitute = averageScopeInstitute;
    }

    public void drinkBeer () {
        System.out.println("I drink beer");
    }

    public void drinkMilk () {
        System.out.println("My name is " + getName() + " and I drink milk !");
    }
}


