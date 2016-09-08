package Module_2_OOP.Lesson7_Nasledovanie.Zadanie2;

/**
 * Created by Roman on 01.12.2015.
 */
public class People {
    private String name;
    private int age;
    private int globalexp;
    private int companyexp;
    private String vacancy;
    private double q;
    private double zp = 4000 * q;


    public People(String name, int age, int globalexp, int companyexp, String vacancy) {
        this.name = name;
        this.age = age;
        this.globalexp = globalexp;
        this.companyexp = companyexp;
        this.vacancy = vacancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGlobalexp() {
        return globalexp;
    }

    public void setGlobalexp(int globalexp) {
        this.globalexp = globalexp;
    }

    public int getCompanyexp() {
        return companyexp;
    }

    public void setCompanyexp(int companyexp) {
        this.companyexp = companyexp;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public double getZp() {
        return zp;
    }

    public double getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public void nachislenie () {
        if (age > 20 && age <=30 && globalexp >= 4 && companyexp >= 2) {
            if (vacancy.equals("Грузчик")) {
                q = 0.5;
            } else if (vacancy.equals("Кладовщик")) {
                q = 1;
            } else if (vacancy.equals("Водитель")) {
                q = 1.2;
            } else if (vacancy.equals("Менеджер")) {
                q = 1.4;
            } else if (vacancy.equals("Программист")) {
                q = 1.6;
            } else if (vacancy.equals("Руководитель отдела")) {
                q = 1.8;
            } else if (vacancy.equals("Директор")) {
                q = 2;
            }
        }

        if (age > 30 && age <=40 && globalexp >=6 && companyexp >=3) {
            if (vacancy.equals("Грузчик")) {
                q = 1.5;
            } else if (vacancy.equals("Кладовщик")) {
                q = 2;
            } else if (vacancy.equals("Водитель")) {
                q = 2.2;
            } else if (vacancy.equals("Менеджер")) {
                q = 2.4;
            } else if (vacancy.equals("Программист")) {
                q = 2.6;
            } else if (vacancy.equals("Руководитель отдела")) {
                q = 2.8;
            } else if (vacancy.equals("Директор")) {
                q = 3;
            }
        }


    }


}
